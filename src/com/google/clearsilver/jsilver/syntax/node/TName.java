/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.google.clearsilver.jsilver.syntax.node;

import com.google.clearsilver.jsilver.syntax.analysis.*;

@SuppressWarnings("nls")
public final class TName extends Token
{
    public TName()
    {
        super.setText("name");
    }

    public TName(int line, int pos)
    {
        super.setText("name");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TName(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTName(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TName text.");
    }
}
