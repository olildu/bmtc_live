package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.FloatingActionButtonElevation;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19798a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Shape d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ FloatingActionButtonElevation g;
    public final /* synthetic */ MutableInteractionSource h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ v30(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, int i3) {
        this.f19798a = i3;
        this.b = function0;
        this.c = modifier;
        this.d = shape;
        this.e = j;
        this.f = j2;
        this.g = floatingActionButtonElevation;
        this.h = mutableInteractionSource;
        this.i = function2;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f19798a) {
            case 0:
                return FloatingActionButtonKt.LargeFloatingActionButton_X_z6DiA$lambda$6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer, ((Integer) obj2).intValue());
            case 1:
                return FloatingActionButtonKt.SmallFloatingActionButton_X_z6DiA$lambda$5(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer, ((Integer) obj2).intValue());
            default:
                return FloatingActionButtonKt.FloatingActionButton_X_z6DiA$lambda$0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer, ((Integer) obj2).intValue());
        }
    }
}
