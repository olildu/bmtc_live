package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gh1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15733a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function3 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ ScrollState j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ gh1(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3 function3, Function2 function2, Function2 function4, int i2, int i3, int i4) {
        this.f15733a = i4;
        this.b = i;
        this.d = modifier;
        this.j = scrollState;
        this.e = j;
        this.f = j2;
        this.g = f;
        this.c = function3;
        this.h = function2;
        this.i = function4;
        this.k = i2;
        this.l = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f15733a) {
            case 0:
                return TabRowKt.SecondaryScrollableTabRow_qhFBPw4$lambda$9(this.b, this.d, this.j, this.e, this.f, this.g, this.c, this.h, this.i, this.k, this.l, composer, ((Integer) obj2).intValue());
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                int i = this.b;
                Modifier modifier = this.d;
                ScrollState scrollState = this.j;
                return TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$7(i, this.c, modifier, this.e, this.f, this.g, this.h, this.i, scrollState, this.k, this.l, composer, iIntValue);
            default:
                return TabRowKt.PrimaryScrollableTabRow_qhFBPw4$lambda$8(this.b, this.d, this.j, this.e, this.f, this.g, this.c, this.h, this.i, this.k, this.l, composer, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ gh1(int i, Function3 function3, Modifier modifier, long j, long j2, float f, Function2 function2, Function2 function4, ScrollState scrollState, int i2, int i3) {
        this.f15733a = 1;
        this.b = i;
        this.c = function3;
        this.d = modifier;
        this.e = j;
        this.f = j2;
        this.g = f;
        this.h = function2;
        this.i = function4;
        this.j = scrollState;
        this.k = i2;
        this.l = i3;
    }
}
