package defpackage;

import android.content.Context;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.CustomAppBarItem;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaNImpl;
import androidx.compose.ui.Modifier;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutScreenKt;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutUiState;
import app.chalo.compose.ContactSupportTextComposableKt;
import app.chalo.compose.components.CircularProgressIndicatorUIState;
import app.chalo.compose.components.divider.DashedDividerKt;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.core.compose.DecomposeAppKt;
import app.chalo.core.compose.DecomposeBackProcessorKt;
import app.chalo.core.compose.DecomposeParentScreenKt;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.electricitybill.ui.base.CustomerInfoUIKt;
import app.chalo.electricitybill.ui.uistate.CustomerInfoUIState;
import app.chalo.metro.ui.confirmbooking.compose.ConfirmBookingScreenUIKt;
import app.chalo.metro.ui.confirmbooking.uistate.PriceDetailsUiState;
import app.chalo.models.contactsupport.ContactSupportUIState;
import app.chalo.navigation.parent.DefaultParentComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt;
import app.chalo.onboarding.cityselection.ui.CitySelectionUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassOfferCardUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassOffersSectionUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseBanner;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseUISpec;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt;
import app.chalo.productpurchase.passpurchase.ui.confirmation.FareMappingFailedBottomSheetUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.PassAlreadyAvailedBottomSheetUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.PassStateDateChangeInfoBannerUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.SuperPassConfirmBtnUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.SuperPassFareDetailsUIState;
import app.chalo.productpurchase.passpurchase.ui.confirmation.SuperPassTncSectionUIState;
import app.chalo.uistate.divider.DashedDividerUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15661a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fp(Object obj, Object obj2, int i, int i2) {
        this.f15661a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15661a) {
            case 0:
                ((Integer) obj2).intValue();
                CitySelectionScreenKt.f((CitySelectionUIState) this.c, (SafeFocusRequester) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 1:
                ((Integer) obj2).getClass();
                CitySelectionScreenKt.d((CircularProgressIndicatorUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return ClickableAppBarItem.MenuContent$lambda$3((ClickableAppBarItem) this.c, (AppBarMenuState) this.d, this.b, (Composer) obj, iIntValue);
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$0((ComposableLambdaImpl) this.c, this.d, this.b, (Composer) obj, iIntValue2);
            case 4:
                int iIntValue3 = ((Integer) obj2).intValue();
                return ComposableLambdaNImpl.invoke$lambda$0((Object[]) this.c, this.b, (ComposableLambdaNImpl) this.d, (Composer) obj, iIntValue3);
            case 5:
                int iIntValue4 = ((Integer) obj2).intValue();
                return CompositionLocalKt.CompositionLocalProvider$lambda$1((ProvidedValue) this.c, (Function2) this.d, this.b, (Composer) obj, iIntValue4);
            case 6:
                int iIntValue5 = ((Integer) obj2).intValue();
                return CompositionLocalKt.CompositionLocalProvider$lambda$0((ProvidedValue[]) this.c, (Function2) this.d, this.b, (Composer) obj, iIntValue5);
            case 7:
                int iIntValue6 = ((Integer) obj2).intValue();
                return CompositionLocalKt.CompositionLocalProvider$lambda$3((CompositionLocalContext) this.c, (Function2) this.d, this.b, (Composer) obj, iIntValue6);
            case 8:
                ((Integer) obj2).getClass();
                ConfirmBookingScreenUIKt.e((Modifier) this.c, (PriceDetailsUiState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).intValue();
                ConfirmSuperPassScreenKt.n((FareMappingFailedBottomSheetUIState) this.c, (SheetState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 10:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.g((ConfirmSuperPassOffersSectionUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 11:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.o((SuperPassTncSectionUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 12:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.q((PassStateDateChangeInfoBannerUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 13:
                ((Integer) obj2).intValue();
                ConfirmSuperPassScreenKt.c((List) this.c, (ConfirmSuperPassPurchaseUISpec) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 14:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.e((SuperPassFareDetailsUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 15:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.f((ConfirmSuperPassOfferCardUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 16:
                ((Integer) obj2).intValue();
                ConfirmSuperPassScreenKt.a((Modifier) this.c, (ConfirmSuperPassPurchaseBanner) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 17:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.l((SuperPassConfirmBtnUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 18:
                ((Integer) obj2).getClass();
                ConfirmSuperPassScreenKt.i((ConfirmSuperPassPurchaseUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 19:
                ((Integer) obj2).intValue();
                ConfirmSuperPassScreenKt.p((PassAlreadyAvailedBottomSheetUIState) this.c, (SheetState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 20:
                ((Integer) obj2).getClass();
                ContactSupportTextComposableKt.a((Modifier) this.c, (ContactSupportUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 21:
                int iIntValue7 = ((Integer) obj2).intValue();
                return ContextMenuScope.Content$lambda$1((ContextMenuScope) this.c, (ContextMenuColors) this.d, this.b, (Composer) obj, iIntValue7);
            case 22:
                int iIntValue8 = ((Integer) obj2).intValue();
                return CustomAppBarItem.MenuContent$lambda$1((CustomAppBarItem) this.c, (AppBarMenuState) this.d, this.b, (Composer) obj, iIntValue8);
            case 23:
                ((Integer) obj2).intValue();
                CustomUrlCheckoutScreenKt.b((CustomUrlCheckoutUiState) this.c, (Function1) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 24:
                ((Integer) obj2).getClass();
                CustomerInfoUIKt.a((Modifier) this.c, (CustomerInfoUIState) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 25:
                ((Integer) obj2).getClass();
                DashedDividerKt.a((DashedDividerUIState) this.c, (Modifier) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 26:
                int iIntValue9 = ((Integer) obj2).intValue();
                return DatePickerKt.WeekDays$lambda$49((DatePickerColors) this.c, (CalendarModel) this.d, this.b, (Composer) obj, iIntValue9);
            case 27:
                ((Integer) obj2).intValue();
                DecomposeAppKt.b((SharedFlow) this.c, (Context) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 28:
                ((Integer) obj2).intValue();
                DecomposeBackProcessorKt.a((RootComponent) this.c, (Function2) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                DecomposeParentScreenKt.a((DefaultParentComponent) this.c, (Function3) this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ fp(Object[] objArr, int i, ComposableLambdaNImpl composableLambdaNImpl) {
        this.f15661a = 4;
        this.c = objArr;
        this.b = i;
        this.d = composableLambdaNImpl;
    }
}
