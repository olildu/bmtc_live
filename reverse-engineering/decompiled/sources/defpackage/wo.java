package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipBorder;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19947a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Shape h;
    public final /* synthetic */ ChipColors i;
    public final /* synthetic */ ChipElevation j;
    public final /* synthetic */ ChipBorder k;
    public final /* synthetic */ MutableInteractionSource l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ wo(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function3, Function2 function4, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4) {
        this.f19947a = i4;
        this.b = function0;
        this.c = function2;
        this.d = modifier;
        this.e = z;
        this.f = function3;
        this.g = function4;
        this.h = shape;
        this.i = chipColors;
        this.j = chipElevation;
        this.k = chipBorder;
        this.l = mutableInteractionSource;
        this.m = i;
        this.n = i2;
        this.o = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f19947a) {
            case 0:
                return ChipKt.ElevatedAssistChip$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer, ((Integer) obj2).intValue());
            default:
                return ChipKt.AssistChip$lambda$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, composer, ((Integer) obj2).intValue());
        }
    }
}
