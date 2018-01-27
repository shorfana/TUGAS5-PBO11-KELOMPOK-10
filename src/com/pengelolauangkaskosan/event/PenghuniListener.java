/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pengelolauangkaskosan.event;

import com.pengelolauangkaskosan.entity.Penghuni;
import com.pengelolauangkaskosan.model.PenghuniModel;

/**
 *
 * @author Shorfana
 */
public interface PenghuniListener {

    public void onChange(PenghuniModel pModel);

    public void onInsert(Penghuni penghuni);

    public void onDelete();

    public void onUpdate(Penghuni penghuni);
}
