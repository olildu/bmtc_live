package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.components.buttons.ChaloSwipeToProceedButtonKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.sos.SosScreenUIKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class am implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ am(Modifier modifier, float f, Object obj, Object obj2, int i, int i2) {
        this.f300a = i2;
        this.b = modifier;
        this.c = f;
        this.e = obj;
        this.f = obj2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f300a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloSwipeToProceedButtonKt.b(this.b, this.c, (IconType) this.e, (IconType) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                NewPremiumBusActivationBottomSheetContentKt.n(this.b, this.c, (TextStyle) this.e, (String) this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SosScreenUIKt.b((ImageUIState) this.e, (TextUIState) this.f, this.c, this.b, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ am(ImageUIState imageUIState, TextUIState textUIState, float f, Modifier modifier, int i) {
        this.f300a = 2;
        this.e = imageUIState;
        this.f = textUIState;
        this.c = f;
        this.b = modifier;
        this.d = i;
    }
}
