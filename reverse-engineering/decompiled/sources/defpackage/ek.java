package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.FloatingActionButtonElevation;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ek implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15561a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ Shape d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Function3 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ ek(Modifier modifier, long j, long j2, Shape shape, Dp dp, ButtonElevation buttonElevation, Function0 function0, Function3 function3, int i, int i2) {
        this.c = modifier;
        this.e = j;
        this.f = j2;
        this.d = shape;
        this.j = dp;
        this.k = buttonElevation;
        this.b = function0;
        this.g = function3;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15561a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                ChaloFilledButtonKt.b(this.c, this.e, this.f, this.d, (Dp) this.j, (ButtonElevation) this.k, this.b, this.g, (Composer) obj, iUpdateChangedFlags, this.i);
                return Unit.f17538a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return FloatingActionButtonKt.ExtendedFloatingActionButton_X_z6DiA$lambda$7(this.b, this.c, this.d, this.e, this.f, (FloatingActionButtonElevation) this.j, (MutableInteractionSource) this.k, this.g, this.h, this.i, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ ek(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, Function3 function3, int i, int i2) {
        this.b = function0;
        this.c = modifier;
        this.d = shape;
        this.e = j;
        this.f = j2;
        this.j = floatingActionButtonElevation;
        this.k = mutableInteractionSource;
        this.g = function3;
        this.h = i;
        this.i = i2;
    }
}
