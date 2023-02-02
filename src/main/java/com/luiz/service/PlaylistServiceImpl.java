package com.luiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luiz.dao.PlaylistDao;
import com.luiz.domain.Playlist;

@Service
@Transactional
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistDao playlistDao;

    @Override
    public void salvar(Playlist playlist) {
        playlistDao.salvar(playlist);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Playlist> recuperar() {
        return playlistDao.recuperar();
    }

    @Override
    @Transactional(readOnly = true)
    public Playlist recuperarPorId(long id) {
        return playlistDao.recuperarPorID(id);
    }

    @Override
    public void atualizar(Playlist playlist) {
        playlistDao.atualizar(playlist);
    }

    @Override
    public void excluir(long id) {
        playlistDao.excluir(id);
    }

}







