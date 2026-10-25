package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15427a = 1;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Arrangement.Horizontal c;
    public final /* synthetic */ Arrangement.Vertical d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Function3 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public /* synthetic */ d40(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, Function3 function3, int i3, int i4) {
        this.b = modifier;
        this.c = horizontal;
        this.d = vertical;
        this.j = vertical2;
        this.e = i;
        this.f = i2;
        this.g = function3;
        this.h = i3;
        this.i = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15427a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return FlowLayoutKt.FlowColumn$lambda$3(this.b, this.d, this.c, (Alignment.Horizontal) this.j, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return FlowLayoutKt.FlowRow$lambda$3(this.b, this.c, this.d, (Alignment.Vertical) this.j, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ d40(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, Function3 function3, int i3, int i4) {
        this.b = modifier;
        this.d = vertical;
        this.c = horizontal;
        this.j = horizontal2;
        this.e = i;
        this.f = i2;
        this.g = function3;
        this.h = i3;
        this.i = i4;
    }
}
