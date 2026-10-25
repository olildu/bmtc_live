package defpackage;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListItemProviderKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.foundation.text.CommonContextMenuAreaKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.State;
import androidx.compose.runtime.changelist.OperationErrorContext;
import androidx.compose.runtime.changelist.OperationKt;
import androidx.compose.runtime.internal.AwaiterQueue;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.DropUnlessLifecycleKt;
import app.chalo.chalobususerprofile.data.model.TimingVariability;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyIntent;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory;
import app.chalo.chalobususerprofile.ui.compose.TimePickerType;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.ui.screen.payment.CheckoutScreenSectionUiModel;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.payment.PaymentViewIntent;
import app.chalo.compose.components.dialogs.MultiSelectDatePickerUIStateFactory;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.home.ui.home.HomeScreenBottomSheetType;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.home.ui.home.HomeUnifiedAdUiState;
import app.chalo.home.ui.home.HomeUnifiedAdUiStateTracker;
import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.home.ui.profile.ProfileScreenViewIntent;
import app.chalo.home.ui.profile.ProfileScreenViewState;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiState;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdUiStateTracker;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsDataState;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsIntent;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsSideEffect;
import app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl;
import app.chalo.livetracking.frameworklivetracking.data.model.app.SubscriptionRetryPolicy;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsComponent;
import app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsIntent;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenIntent;
import app.chalo.ridehailing.feedback.UserFeedbackRatingData;
import app.chalo.ridehailing.feedback.UserFeedbackReasonData;
import app.chalo.uistate.dialog.DateDataState;
import app.chalo.uistate.dialog.MultiSelectDatePickerEventHandler;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.extensions.compose.stack.animation.AbstractStackAnimation;
import com.arkivanov.decompose.extensions.compose.stack.animation.Direction;
import com.arkivanov.decompose.extensions.compose.stack.animation.DirectionKt;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapClickListenerNode;
import io.github.alexzhirkevich.compottie.internal.AnimationState;
import io.github.alexzhirkevich.keight.ScriptEngine;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.datetime.internal.format.parser.AssignableField;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18359a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(int i, Object obj, Object obj2, Object obj3) {
        this.f18359a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HomeUnifiedAdUiState homeUnifiedAdUiState;
        RegularBusUnifiedAdUiState regularBusUnifiedAdUiState;
        int i = this.f18359a;
        Unit unit = Unit.f17538a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                AbstractStackAnimation.AnimationItem animationItem = (AbstractStackAnimation.AnimationItem) obj3;
                MutableState mutableState = (MutableState) obj;
                if (DirectionKt.a(animationItem.b)) {
                    mutableState.setValue(MapsKt.j((Map) mutableState.getValue(), obj2));
                } else {
                    Map map = (Map) mutableState.getValue();
                    Child.Created child = animationItem.f12303a;
                    Direction direction = animationItem.b;
                    boolean z = animationItem.c;
                    Intrinsics.i(child, "child");
                    Intrinsics.i(direction, "direction");
                    mutableState.setValue(MapsKt.m(map, new Pair(obj2, new AbstractStackAnimation.AnimationItem(child, direction, z, (Child.Created) null))));
                }
                return unit;
            case 1:
                return (ScriptEngine) ((Function2) obj3).invoke((CoroutineContext) obj2, (AnimationState) obj);
            case 2:
                return AwaiterQueue.addAwaiter$lambda$1((AwaiterQueue.Awaiter) obj3, (AwaiterQueue) obj2, (Ref.IntRef) obj);
            case 3:
                float f = BottomSheetScaffoldKt.f4445a;
                return new BottomSheetState((BottomSheetValue) obj3, (AnimationSpec) obj2, (Function1) obj);
            case 4:
                return BringIntoViewResponderNode.bringIntoView$lambda$1((BringIntoViewResponderNode) obj3, (LayoutCoordinates) obj2, (Function0) obj);
            case 5:
                return CertificatePinner.check$lambda$1((CertificatePinner) obj3, (List) obj2, (String) obj);
            case 6:
                Function1 function1 = (Function1) obj2;
                TimingVariability timingVariability = (TimingVariability) obj;
                int i2 = ChaloBusUserProfileSurveyUiStateFactory.WhenMappings.f1226a[((TimePickerType) obj3).ordinal()];
                if (i2 == 1) {
                    function1.invoke(new ChaloBusUserProfileSurveyIntent.WorkTimingStartVariabilityChanged(timingVariability));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function1.invoke(new ChaloBusUserProfileSurveyIntent.WorkTimingEndVariabilityChanged(timingVariability));
                }
                return unit;
            case 7:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$3$0((CoroutineScope) obj3, (MutableState) obj, (TextFieldSelectionManager) obj2);
            case 8:
                return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$10$0((CoroutineScope) obj3, (MutableState) obj, (TextFieldSelectionState) obj2);
            case 9:
                return ConnectPlan.connectTls$lambda$4((CertificatePinner) obj3, (Handshake) obj2, (Address) obj);
            case 10:
                return DropUnlessLifecycleKt.dropUnlessStateIsAtLeast$lambda$2$lambda$1((LifecycleOwner) obj3, (Lifecycle.State) obj2, (Function0) obj);
            case 11:
                return Boolean.valueOf(ExposedDropdownMenuKt.expandable_3_2CpT8$lambda$25$lambda$24((Function0) obj3, (String) obj2, (SoftwareKeyboardController) obj));
            case 12:
                ((Function1) obj3).invoke(new HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent(((app.chalo.home.BottomSheetState) ((MutableState) obj).getValue()).b));
                ((HomeScreenInfoHelper) obj2).d(true);
                return unit;
            case 13:
                PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData = (PremiumBusInAppCommunicationBottomSheetData) obj2;
                Function1 function2 = (Function1) obj;
                if (Intrinsics.d((HomeScreenBottomSheetType) obj3, HomeScreenBottomSheetType.PremiumBusInAppCommunicationBottomSheet.f3534a) && premiumBusInAppCommunicationBottomSheetData != null) {
                    function2.invoke(new HomeScreenViewIntent.PremiumBusAckBottomSheetNegativeCtaClickedIntent(premiumBusInAppCommunicationBottomSheetData));
                }
                return unit;
            case 14:
                HomeUnifiedAdUiStateTracker homeUnifiedAdUiStateTracker = (HomeUnifiedAdUiStateTracker) obj3;
                String sectionId = (String) obj2;
                MutableState mutableState2 = (MutableState) obj;
                homeUnifiedAdUiStateTracker.getClass();
                Intrinsics.i(sectionId, "sectionId");
                if (Intrinsics.d(homeUnifiedAdUiStateTracker.b, sectionId)) {
                    HomeUnifiedAdUiState homeUnifiedAdUiState2 = homeUnifiedAdUiStateTracker.c;
                    homeUnifiedAdUiStateTracker.c = new HomeUnifiedAdUiState(homeUnifiedAdUiState2.c, homeUnifiedAdUiState2.d, true, true);
                    homeUnifiedAdUiStateTracker.f3583a.put(sectionId, Boolean.TRUE);
                    homeUnifiedAdUiState = homeUnifiedAdUiStateTracker.c;
                } else {
                    homeUnifiedAdUiState = homeUnifiedAdUiStateTracker.c;
                }
                mutableState2.setValue(homeUnifiedAdUiState);
                return unit;
            case 15:
                return LazyLayoutPagerKt.rememberPagerItemProviderLambda$lambda$0$0((State) obj3, (State) obj2, (Function0) obj);
            case 16:
                return LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$1((State) obj3, (LazyListState) obj2, (LazyItemScopeImpl) obj);
            case 17:
                return new MapClickListenerNode(((MapApplier) obj3).f14602a, (Function2) obj, obj2);
            case 18:
                ((Function1) obj3).invoke(MinKycDetailsSideEffect.ClearFocus.f4126a);
                ((Function1) obj2).invoke(new MinKycDetailsIntent.ProceedButtonClickedIntent(((MinKycDetailsDataState) obj).f4119a));
                return unit;
            case 19:
                return ModalBottomSheetKt.ModalBottomSheet_YbuCTN8$lambda$4$lambda$3((SheetState) obj3, (CoroutineScope) obj2, (Function0) obj);
            case 20:
                MultiSelectDatePickerEventHandler multiSelectDatePickerEventHandler = (MultiSelectDatePickerEventHandler) obj3;
                ((MultiSelectDatePickerUIStateFactory) obj2).getClass();
                List list = ((MultiSelectionCalendarDataState) obj).f10011a;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (((DateDataState) obj4).b) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj5 = arrayList.get(i3);
                    i3++;
                    arrayList2.add(((DateDataState) obj5).f9976a);
                }
                multiSelectDatePickerEventHandler.c(arrayList2);
                return unit;
            case 21:
                return OperationKt.attachComposeStackTrace$lambda$0((Anchor) obj3, (SlotWriter) obj2, (OperationErrorContext) obj);
            case 22:
                return "Attempting to assign conflicting values '" + obj2 + "' and '" + obj3 + "' to field '" + ((AssignableField) obj).getB() + '\'';
            case 23:
                CheckoutScreenSectionUiModel checkoutScreenSectionUiModel = (CheckoutScreenSectionUiModel) obj3;
                PaymentMainComponent paymentMainComponent = (PaymentMainComponent) obj2;
                CheckoutPaymentItem checkoutPaymentItem = (CheckoutPaymentItem) obj;
                if ((checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.ChaloPay) || (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.PreferredModes)) {
                    paymentMainComponent.s1(new PaymentViewIntent.PreferredItemSelected((CheckoutPaymentItem.IndividualCheckoutItem) checkoutPaymentItem));
                } else if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.OneClickUPI) {
                    paymentMainComponent.s1(new PaymentViewIntent.InAppUpiMethodSelected((CheckoutPaymentItem.IndividualCheckoutItem.InAppUpiItem) checkoutPaymentItem));
                } else if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.OtherPaymentModes) {
                    paymentMainComponent.s1(new PaymentViewIntent.PaymentMethodSelected((CheckoutPaymentItem.PaymentMethodItem) checkoutPaymentItem));
                } else if (checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.UPIApps) {
                    paymentMainComponent.s1(new PaymentViewIntent.UpiAppSelected((CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem) checkoutPaymentItem));
                } else {
                    if (!(checkoutScreenSectionUiModel instanceof CheckoutScreenSectionUiModel.NativeUPIApps)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    paymentMainComponent.s1(new PaymentViewIntent.NativeUpiAppSelected((CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem) checkoutPaymentItem));
                }
                return unit;
            case 24:
                String str = (String) obj3;
                String str2 = (String) obj2;
                PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent = (PbPassPurchaseLandingScreenComponent) obj;
                if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                    pbPassPurchaseLandingScreenComponent.O0(new PbPassPurchaseLandingScreenIntent.ProceedBtnClickIntent(str, str2));
                }
                return unit;
            case 25:
                ((PremiumBusProductModificationReasonsComponent) obj3).N0(new PremiumBusProductModificationReasonsIntent.SlotClickedIntent((PBAvailableSlotsTripAppModel) obj2, (PBAvailableSlotsInfoAppModel) obj));
                return unit;
            case 26:
                ProfileScreenComponent profileScreenComponent = (ProfileScreenComponent) obj3;
                Function0 function0 = (Function0) obj2;
                if (((ProfileScreenViewState) ((MutableState) obj).getValue()).j) {
                    profileScreenComponent.H0(ProfileScreenViewIntent.JuspayBackPressedIntent.f3611a);
                } else {
                    function0.invoke();
                }
                return unit;
            case 27:
                Ref.LongRef longRef = (Ref.LongRef) obj2;
                long j = longRef.element;
                float f2 = ((SubscriptionRetryPolicy) obj).f4316a;
                ((RealTimeSocketManagerImpl) obj3).getClass();
                float f3 = j;
                long j2 = (long) ((f2 * f3) + f3);
                longRef.element = j2;
                return Long.valueOf(j2);
            case 28:
                RegularBusUnifiedAdUiStateTracker regularBusUnifiedAdUiStateTracker = (RegularBusUnifiedAdUiStateTracker) obj3;
                String sectionId2 = (String) obj2;
                MutableState mutableState3 = (MutableState) obj;
                regularBusUnifiedAdUiStateTracker.getClass();
                Intrinsics.i(sectionId2, "sectionId");
                if (Intrinsics.d(regularBusUnifiedAdUiStateTracker.b, sectionId2)) {
                    RegularBusUnifiedAdUiState regularBusUnifiedAdUiState2 = regularBusUnifiedAdUiStateTracker.c;
                    regularBusUnifiedAdUiStateTracker.c = new RegularBusUnifiedAdUiState(regularBusUnifiedAdUiState2.c, regularBusUnifiedAdUiState2.d, true, true);
                    regularBusUnifiedAdUiStateTracker.f3637a.put(sectionId2, Boolean.TRUE);
                    regularBusUnifiedAdUiState = regularBusUnifiedAdUiStateTracker.c;
                } else {
                    regularBusUnifiedAdUiState = regularBusUnifiedAdUiStateTracker.c;
                }
                mutableState3.setValue(regularBusUnifiedAdUiState);
                return unit;
            default:
                ((Function2) obj3).invoke(((UserFeedbackRatingData) obj2).b, Integer.valueOf(((UserFeedbackReasonData) obj).f9174a));
                return unit;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f18359a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public /* synthetic */ m(Object obj, Object obj2, AssignableField assignableField) {
        this.f18359a = 22;
        this.c = obj;
        this.b = obj2;
        this.d = assignableField;
    }
}
