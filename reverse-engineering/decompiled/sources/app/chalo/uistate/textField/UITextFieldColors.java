package app.chalo.uistate.textField;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textField/UITextFieldColors;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UITextFieldColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10112a;
    public final ChaloColorToken b;
    public final ChaloColorToken c;
    public final ChaloColorToken d;
    public final ChaloColorToken e;
    public final ChaloColorToken f;
    public final ChaloColorToken g;
    public final ChaloColorToken h;
    public final ChaloColorToken i;
    public final ChaloColorToken j;
    public final ChaloColorToken k;
    public final ChaloColorToken l;
    public final ChaloColorToken m;
    public final ChaloColorToken n;
    public final ChaloColorToken o;
    public final ChaloColorToken p;
    public final ChaloColorToken q;
    public final ChaloColorToken r;
    public final ChaloColorToken s;
    public final ChaloColorToken t;
    public final ChaloColorToken u;

    public UITextFieldColors(ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2, ChaloColorToken chaloColorToken3, ChaloColorToken chaloColorToken4, ChaloColorToken chaloColorToken5, ChaloColorToken chaloColorToken6, ChaloColorToken chaloColorToken7, ChaloColorToken chaloColorToken8, ChaloColorToken chaloColorToken9, ChaloColorToken chaloColorToken10, ChaloColorToken chaloColorToken11, ChaloColorToken chaloColorToken12, int i) {
        int i2 = i & 1;
        ChaloColorToken chaloColorTokenA = ChaloColorToken.Black_87.f9768a;
        ChaloColorToken chaloColorToken13 = i2 != 0 ? chaloColorTokenA : chaloColorToken;
        ChaloColorToken chaloColorToken14 = (i & 2) != 0 ? chaloColorTokenA : chaloColorToken2;
        chaloColorTokenA = (i & 4) != 0 ? ChaloColorTokenKt.a(0.4f, chaloColorTokenA) : chaloColorTokenA;
        int i3 = i & 64;
        ChaloColorToken chaloColorToken15 = ChaloColorToken.Black_40.f9764a;
        ChaloColorToken chaloColorToken16 = i3 != 0 ? chaloColorToken15 : chaloColorToken3;
        ChaloColorToken chaloColorToken17 = (i & 128) != 0 ? chaloColorToken15 : chaloColorToken4;
        ChaloColorToken chaloColorToken18 = (i & 256) != 0 ? chaloColorToken15 : chaloColorToken5;
        ChaloColorToken chaloColorToken19 = (i & 512) != 0 ? chaloColorToken15 : chaloColorToken6;
        int i4 = i & 1024;
        ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
        ChaloColorToken unfocusedIndicatorColor = i4 != 0 ? transparent : chaloColorToken7;
        ChaloColorToken focusedIndicatorColor = (i & 2048) != 0 ? transparent : chaloColorToken8;
        ChaloColorToken chaloColorToken20 = (i & 4096) != 0 ? transparent : chaloColorToken9;
        ChaloColorToken chaloColorToken21 = (i & 8192) != 0 ? transparent : chaloColorToken10;
        ChaloColorToken chaloColorToken22 = (i & 16384) != 0 ? ChaloColorToken.OrangePrimary.f9835a : chaloColorToken11;
        ChaloColorToken chaloColorToken23 = (i & 32768) != 0 ? ChaloColorToken.DarkRed.f9786a : chaloColorToken12;
        int i5 = i & 131072;
        ChaloColorToken.Black_60 black_60 = ChaloColorToken.Black_60.f9766a;
        chaloColorToken15 = i5 == 0 ? black_60 : chaloColorToken15;
        ChaloColorToken chaloColorToken24 = (i & 524288) != 0 ? chaloColorToken15 : black_60;
        ChaloColorToken.Transparent transparent2 = (i & 1048576) != 0 ? null : transparent;
        ChaloColorToken chaloColorToken25 = chaloColorToken15;
        Intrinsics.i(unfocusedIndicatorColor, "unfocusedIndicatorColor");
        Intrinsics.i(focusedIndicatorColor, "focusedIndicatorColor");
        this.f10112a = chaloColorToken13;
        this.b = chaloColorToken14;
        this.c = chaloColorTokenA;
        this.d = transparent;
        this.e = transparent;
        this.f = transparent;
        this.g = chaloColorToken16;
        this.h = chaloColorToken17;
        this.i = chaloColorToken18;
        this.j = chaloColorToken19;
        this.k = unfocusedIndicatorColor;
        this.l = focusedIndicatorColor;
        this.m = chaloColorToken20;
        this.n = chaloColorToken21;
        this.o = chaloColorToken22;
        this.p = chaloColorToken23;
        this.q = transparent;
        this.r = chaloColorToken25;
        this.s = chaloColorToken15;
        this.t = chaloColorToken24;
        this.u = transparent2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UITextFieldColors)) {
            return false;
        }
        UITextFieldColors uITextFieldColors = (UITextFieldColors) obj;
        return Intrinsics.d(this.f10112a, uITextFieldColors.f10112a) && Intrinsics.d(this.b, uITextFieldColors.b) && Intrinsics.d(this.c, uITextFieldColors.c) && Intrinsics.d(this.d, uITextFieldColors.d) && Intrinsics.d(this.e, uITextFieldColors.e) && Intrinsics.d(this.f, uITextFieldColors.f) && Intrinsics.d(this.g, uITextFieldColors.g) && Intrinsics.d(this.h, uITextFieldColors.h) && Intrinsics.d(this.i, uITextFieldColors.i) && Intrinsics.d(this.j, uITextFieldColors.j) && Intrinsics.d(this.k, uITextFieldColors.k) && Intrinsics.d(this.l, uITextFieldColors.l) && Intrinsics.d(this.m, uITextFieldColors.m) && Intrinsics.d(this.n, uITextFieldColors.n) && Intrinsics.d(this.o, uITextFieldColors.o) && Intrinsics.d(this.p, uITextFieldColors.p) && Intrinsics.d(this.q, uITextFieldColors.q) && Intrinsics.d(this.r, uITextFieldColors.r) && Intrinsics.d(this.s, uITextFieldColors.s) && Intrinsics.d(this.t, uITextFieldColors.t) && Intrinsics.d(this.u, uITextFieldColors.u);
    }

    public final int hashCode() {
        int iB = z40.b(this.t, z40.b(this.s, z40.b(this.r, z40.b(this.q, z40.b(this.p, z40.b(this.o, z40.b(this.n, z40.b(this.m, z40.b(this.l, z40.b(this.k, z40.b(this.j, z40.b(this.i, z40.b(this.h, z40.b(this.g, z40.b(this.f, z40.b(this.e, z40.b(this.d, z40.b(this.c, z40.b(this.b, this.f10112a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        ChaloColorToken chaloColorToken = this.u;
        return (iB + (chaloColorToken == null ? 0 : chaloColorToken.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UITextFieldColors(focusedTextColor=");
        sb.append(this.f10112a);
        sb.append(", unfocusedTextColor=");
        sb.append(this.b);
        sb.append(", disabledTextColor=");
        sb.append(this.c);
        sb.append(", focusedContainerColor=");
        sb.append(this.d);
        sb.append(", unfocusedContainerColor=");
        sb.append(this.e);
        sb.append(", disabledContainerColor=");
        sb.append(this.f);
        sb.append(", errorLabelColor=");
        sb.append(this.g);
        sb.append(", focusedLabelColor=");
        sb.append(this.h);
        sb.append(", disabledLabelColor=");
        sb.append(this.i);
        sb.append(", unfocusedLabelColor=");
        sb.append(this.j);
        sb.append(", unfocusedIndicatorColor=");
        sb.append(this.k);
        sb.append(", focusedIndicatorColor=");
        sb.append(this.l);
        sb.append(", disabledIndicatorColor=");
        sb.append(this.m);
        sb.append(", errorIndicatorColor=");
        sb.append(this.n);
        sb.append(", cursorColor=");
        sb.append(this.o);
        sb.append(", errorCursorColor=");
        sb.append(this.p);
        sb.append(", errorContainerColor=");
        sb.append(this.q);
        sb.append(", focusedPlaceholderColor=");
        sb.append(this.r);
        sb.append(", disabledPlaceholderColor=");
        sb.append(this.s);
        sb.append(", unfocusedPlaceholderColor=");
        sb.append(this.t);
        sb.append(", selectionHandleColor=");
        return pk0.j(sb, this.u, ", selectionBackgroundColor=null)");
    }
}
