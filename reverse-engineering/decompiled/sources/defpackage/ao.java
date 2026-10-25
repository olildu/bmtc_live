package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import app.chalo.checkout.ui.payment.CheckoutItemListKt;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiSpec;
import app.chalo.compose.components.TooltipPopupComposableKt;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerConfigModelKt;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import app.chalo.uistate.button.ClickableTextUiState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ao implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f691a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ao(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.f691a = i;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f691a) {
            case 0:
                PaymentCardUiSpec paymentCardUiSpec = (PaymentCardUiSpec) this.c;
                List list = (List) this.d;
                ClickableTextUiState clickableTextUiState = (ClickableTextUiState) this.e;
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1160995656, iIntValue, -1, "app.chalo.checkout.ui.payment.CheckoutItemList.<anonymous> (CheckoutItemList.kt:122)");
                    }
                    if (this.b) {
                        composer.startReplaceGroup(150084304);
                        CheckoutItemListKt.f(paymentCardUiSpec, list, clickableTextUiState, composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(150274458);
                        CheckoutItemListKt.e(paymentCardUiSpec, list, clickableTextUiState, composer, 0);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            case 1:
                return ClickableKt.clickable_XHw0xAI$lambda$1(this.b, (String) this.c, (Role) this.d, (Function0) this.e, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return TextFieldScrollKt.textFieldScrollable$lambda$1((TextFieldScrollerPosition) this.c, this.b, (OverscrollEffect) this.d, (MutableInteractionSource) this.e, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return ToggleableKt.triStateToggleable_XHw0xAI$lambda$1((ToggleableState) this.c, this.b, (Role) this.d, (Function0) this.e, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                TripPlannerTabType tripPlannerTabType = (TripPlannerTabType) this.c;
                TripPlannerTabType tripPlannerTabType2 = (TripPlannerTabType) this.d;
                Function0 function0 = (Function0) this.e;
                ColumnScope Tab = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(Tab, "$this$Tab");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= composer2.changed(Tab) ? 4 : 2;
                }
                if (composer2.shouldExecute((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1420598670, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.result.ui.tripPlannerQuickFilterTab.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TripPlannerResultsScreen.kt:576)");
                    }
                    boolean z = this.b && Intrinsics.d(tripPlannerTabType, tripPlannerTabType2) && TripPlannerConfigModelKt.a(tripPlannerTabType2);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ag1(function0, 10);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    TooltipPopupComposableKt.a(null, null, z, null, 0L, 0.0f, 0.0f, null, false, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-39021325, true, new ob(26, Tab, tripPlannerTabType, tripPlannerTabType2), composer2, 54), ComposableLambdaKt.rememberComposableLambda(-2122468483, true, new ze(function0, 5), composer2, 54), composer2, 0, 432, 1019);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f17538a;
        }
    }

    public /* synthetic */ ao(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.f691a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
