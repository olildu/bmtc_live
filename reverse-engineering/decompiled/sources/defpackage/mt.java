package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowLayoutKt;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18427a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Arrangement.Vertical d;
    public final /* synthetic */ Arrangement.Horizontal e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Function4 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ FlowLayoutOverflow l;

    public /* synthetic */ mt(int i, Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, ContextualFlowRowOverflow contextualFlowRowOverflow, Function4 function4, int i4, int i5) {
        this.b = i;
        this.c = modifier;
        this.e = horizontal;
        this.d = vertical;
        this.k = vertical2;
        this.f = i2;
        this.g = i3;
        this.l = contextualFlowRowOverflow;
        this.h = function4;
        this.i = i4;
        this.j = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18427a) {
            case 0:
                return ContextualFlowLayoutKt.ContextualFlowRow$lambda$3(this.b, this.c, this.e, this.d, (Alignment.Vertical) this.k, this.f, this.g, (ContextualFlowRowOverflow) this.l, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return ContextualFlowLayoutKt.ContextualFlowColumn$lambda$3(this.b, this.c, this.d, this.e, (Alignment.Horizontal) this.k, this.f, this.g, (ContextualFlowColumnOverflow) this.l, this.h, this.i, this.j, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ mt(int i, Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, ContextualFlowColumnOverflow contextualFlowColumnOverflow, Function4 function4, int i4, int i5) {
        this.b = i;
        this.c = modifier;
        this.d = vertical;
        this.e = horizontal;
        this.k = horizontal2;
        this.f = i2;
        this.g = i3;
        this.l = contextualFlowColumnOverflow;
        this.h = function4;
        this.i = i4;
        this.j = i5;
    }
}
