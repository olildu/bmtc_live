package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19053a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ TextStyle c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ PaddingValues k;
    public final /* synthetic */ int l;

    public /* synthetic */ po(Function2 function2, TextStyle textStyle, long j, Function2 function3, Function2 function4, Function2 function5, long j2, long j3, float f, PaddingValues paddingValues, int i, int i2) {
        this.f19053a = i2;
        this.b = function2;
        this.c = textStyle;
        this.d = j;
        this.e = function3;
        this.f = function4;
        this.g = function5;
        this.h = j2;
        this.i = j3;
        this.j = f;
        this.k = paddingValues;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f19053a) {
            case 0:
                return ChipKt.ChipContent_fe0OD_I$lambda$23(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer, ((Integer) obj2).intValue());
            default:
                return ChipKt.AnimatingChipContent_fe0OD_I$lambda$24(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer, ((Integer) obj2).intValue());
        }
    }
}
