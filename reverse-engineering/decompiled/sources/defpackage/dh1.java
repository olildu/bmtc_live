package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dh1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15463a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ MutableInteractionSource j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ dh1(boolean z, Function0 function0, Modifier modifier, boolean z2, Function2 function2, Function2 function3, long j, long j2, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.c = function0;
        this.f = modifier;
        this.g = z2;
        this.d = function2;
        this.e = function3;
        this.h = j;
        this.i = j2;
        this.j = mutableInteractionSource;
        this.k = i;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f15463a) {
            case 0:
                return TabKt.Tab_wqdebIU$lambda$1(this.b, this.c, this.f, this.g, this.d, this.e, this.h, this.i, this.j, this.k, this.l, composer, ((Integer) obj2).intValue());
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return TabKt.LeadingIconTab_wqdebIU$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer, iIntValue);
        }
    }

    public /* synthetic */ dh1(boolean z, Function0 function0, Function2 function2, Function2 function3, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.b = z;
        this.c = function0;
        this.d = function2;
        this.e = function3;
        this.f = modifier;
        this.g = z2;
        this.h = j;
        this.i = j2;
        this.j = mutableInteractionSource;
        this.k = i;
        this.l = i2;
    }
}
