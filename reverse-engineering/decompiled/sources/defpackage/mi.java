package defpackage;

import androidx.compose.material3.ButtonElevation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.ncmc.ui.landing.compose.ChaloCardComposeItemsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mi implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18400a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ mi(Modifier modifier, String str, TextStyle textStyle, long j, Function2 function2, Function0 function0, int i, int i2) {
        this.c = modifier;
        this.b = str;
        this.h = textStyle;
        this.d = j;
        this.i = function2;
        this.e = function0;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18400a) {
            case 0:
                ((Integer) obj2).getClass();
                ChaloCardComposeItemsKt.e(this.c, this.b, (TextStyle) this.h, this.d, (Function2) this.i, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                ChaloFilledButtonKt.k(this.b, this.c, this.d, (Shape) this.h, (ButtonElevation) this.i, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1), this.g);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ mi(String str, Modifier modifier, long j, Shape shape, ButtonElevation buttonElevation, Function0 function0, int i, int i2) {
        this.b = str;
        this.c = modifier;
        this.d = j;
        this.h = shape;
        this.i = buttonElevation;
        this.e = function0;
        this.f = i;
        this.g = i2;
    }
}
