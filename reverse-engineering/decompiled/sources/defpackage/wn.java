package defpackage;

import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.SelectedRangeInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import app.chalo.ads.ExitInterstitialAdManager;
import app.chalo.behaviour.policy.CityAutoSelectionApplicable;
import app.chalo.checkout.ui.screen.card.CheckoutCardViewState;
import app.chalo.checkout.ui.screen.card.PaymentCardFieldUiState;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentDataState;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessScreenDetail;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.constants.Source;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.exception.EBillAmountException;
import app.chalo.electricitybill.ui.ebillamount.EBillAmountDataState;
import app.chalo.electricitybill.ui.ebillamount.EBillAmountIntent;
import app.chalo.electricitybill.ui.ebillpaymentsuccess.EBillPaymentSuccessDataState;
import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.metro.data.app.MetroFinalFareAppModel;
import app.chalo.metro.data.app.MetroTicketAppModel;
import app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenDataState;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionLayoutType;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionSource;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.onboarding.cityselection.ui.CitySelectionComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionDataState;
import app.chalo.ondc.model.app.OndcMetroTicketAppModel;
import app.chalo.ondc.model.app.OndcTicketAppModel;
import app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.MinProfileUpdateArgs;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.GenericComponentContext;
import com.arkivanov.essenty.instancekeeper.InstanceKeeper;
import com.google.firebase.messaging.ServiceStarter;
import defpackage.gf;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19945a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wn(int i, Object obj, Object obj2) {
        this.f19945a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19945a) {
            case 0:
                final CheckoutCardViewState checkoutCardViewState = (CheckoutCardViewState) this.b;
                final FocusRequester focusRequester = (FocusRequester) this.c;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                final List list = checkoutCardViewState.c;
                LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.checkout.ui.screen.card.compose.CheckoutCardScreenKt$CheckoutCardScreenContent$lambda$0$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.checkout.ui.screen.card.compose.CheckoutCardScreenKt$CheckoutCardScreenContent$lambda$0$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        final int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        boolean z = true;
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            final PaymentCardFieldUiState paymentCardFieldUiState = (PaymentCardFieldUiState) list.get(iIntValue);
                            composer.startReplaceGroup(-2127884147);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            boolean zChanged = composer.changed(paymentCardFieldUiState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<FocusState, Unit>() { // from class: app.chalo.checkout.ui.screen.card.compose.CheckoutCardScreenKt$CheckoutCardScreenContent$1$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        FocusState focusState = (FocusState) obj6;
                                        Intrinsics.i(focusState, "focusState");
                                        paymentCardFieldUiState.b.b.getB().a(focusState.isFocused());
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFillMaxWidth$default, (Function1) objRememberedValue);
                            if ((((i & 112) ^ 48) <= 32 || !composer.changed(iIntValue)) && (i & 48) != 32) {
                                z = false;
                            }
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0<Boolean>() { // from class: app.chalo.checkout.ui.screen.card.compose.CheckoutCardScreenKt$CheckoutCardScreenContent$1$1$1$1$2$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Boolean.valueOf(iIntValue == 0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function0 = (Function0) objRememberedValue2;
                            final FocusRequester focusRequester2 = focusRequester;
                            boolean zChanged2 = composer.changed(focusRequester2);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<Modifier, Modifier>() { // from class: app.chalo.checkout.ui.screen.card.compose.CheckoutCardScreenKt$CheckoutCardScreenContent$1$1$1$1$3$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        Modifier conditional = (Modifier) obj6;
                                        Intrinsics.i(conditional, "$this$conditional");
                                        return FocusRequesterModifierKt.focusRequester(conditional, focusRequester2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            CheckoutCardTextFieldKt.a(ComposeUtilsKt.c(modifierOnFocusChanged, function0, (Function1) objRememberedValue3), paymentCardFieldUiState.b, composer, 0);
                            CheckoutCardViewState checkoutCardViewState2 = checkoutCardViewState;
                            if (iIntValue != CollectionsKt.K(checkoutCardViewState2.c)) {
                                composer.startReplaceGroup(-2127278718);
                                gf.r(companion, checkoutCardViewState2.f1446a.d, composer, 0);
                            } else {
                                composer.startReplaceGroup(-2130688191);
                                composer.endReplaceGroup();
                            }
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                return Unit.f17538a;
            case 1:
                OndcTicketAppModel ondcTicketAppModel = (OndcTicketAppModel) this.b;
                String str = (String) this.c;
                PostPaymentDataState it = (PostPaymentDataState) obj;
                Intrinsics.i(it, "it");
                return PostPaymentDataState.a(it, false, new PostPaymentSuccessScreenDetail(new PostPaymentSuccessProductType.OndcTicket(ondcTicketAppModel.f6771a), str, null, LottieType.NEW_PAYMENT_SUCCESS, ServiceStarter.ERROR_UNKNOWN), null, 4);
            case 2:
                MultiModalGroupTicketAppModel multiModalGroupTicketAppModel = (MultiModalGroupTicketAppModel) this.b;
                String str2 = (String) this.c;
                PostPaymentDataState it2 = (PostPaymentDataState) obj;
                Intrinsics.i(it2, "it");
                return PostPaymentDataState.a(it2, false, new PostPaymentSuccessScreenDetail(new PostPaymentSuccessProductType.MultiModalGroupTicket(multiModalGroupTicketAppModel.f5874a), str2, null, LottieType.NEW_PAYMENT_SUCCESS, ServiceStarter.ERROR_UNKNOWN), null, 4);
            case 3:
                MetroTicketAppModel metroTicketAppModel = (MetroTicketAppModel) this.b;
                String str3 = (String) this.c;
                PostPaymentDataState it3 = (PostPaymentDataState) obj;
                Intrinsics.i(it3, "it");
                return PostPaymentDataState.a(it3, false, new PostPaymentSuccessScreenDetail(new PostPaymentSuccessProductType.MetroTicket(metroTicketAppModel.f5431a), str3, null, LottieType.NEW_PAYMENT_SUCCESS, ServiceStarter.ERROR_UNKNOWN), null, 4);
            case 4:
                OndcMetroTicketAppModel ondcMetroTicketAppModel = (OndcMetroTicketAppModel) this.b;
                String str4 = (String) this.c;
                PostPaymentDataState it4 = (PostPaymentDataState) obj;
                Intrinsics.i(it4, "it");
                return PostPaymentDataState.a(it4, false, new PostPaymentSuccessScreenDetail(new PostPaymentSuccessProductType.OndcTicket(ondcMetroTicketAppModel.f6769a), str4, null, LottieType.NEW_PAYMENT_SUCCESS, ServiceStarter.ERROR_UNKNOWN), null, 4);
            case 5:
                InstantTicketEntity instantTicketEntity = (InstantTicketEntity) this.b;
                String str5 = (String) this.c;
                PostPaymentDataState it5 = (PostPaymentDataState) obj;
                Intrinsics.i(it5, "it");
                return PostPaymentDataState.a(it5, false, new PostPaymentSuccessScreenDetail(new PostPaymentSuccessProductType.InstantTicket(instantTicketEntity.f3840a), str5, null, LottieType.NEW_PAYMENT_SUCCESS, ServiceStarter.ERROR_UNKNOWN), null, 4);
            case 6:
                PostPaymentSuccessProductType.MTicket mTicket = (PostPaymentSuccessProductType.MTicket) this.b;
                String str6 = (String) this.c;
                PostPaymentDataState it6 = (PostPaymentDataState) obj;
                Intrinsics.i(it6, "it");
                return PostPaymentDataState.a(it6, false, new PostPaymentSuccessScreenDetail(mTicket, str6, null, LottieType.NEW_PAYMENT_SUCCESS, ServiceStarter.ERROR_UNKNOWN), null, 4);
            case 7:
                GenericComponentContext genericComponentContext = (GenericComponentContext) this.b;
                String str7 = (String) this.c;
                Function0 factory = (Function0) obj;
                Intrinsics.i(factory, "factory");
                InstanceKeeper c = genericComponentContext.getC();
                InstanceKeeper.Instance instance = c.get(str7);
                if (instance != null) {
                    return instance;
                }
                InstanceKeeper.Instance instance2 = (InstanceKeeper.Instance) factory.invoke();
                c.a(str7, instance2);
                return instance2;
            case 8:
                CityAutoSelectionApplicable cityAutoSelectionApplicable = (CityAutoSelectionApplicable) this.b;
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, false, (CityLocationSelectionSource) this.c, null, null, null, null, null, false, cityAutoSelectionApplicable, cityAutoSelectionApplicable instanceof CityAutoSelectionApplicable.Yes, 509);
            case 9:
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, true, (CityLocationSelectionSource) this.b, (CityLocationSelectionLayoutType) this.c, null, null, null, null, false, null, false, 2040);
            case 10:
                CitySelectionComponent citySelectionComponent = (CitySelectionComponent) this.b;
                String str8 = (String) this.c;
                CitySelectionDataState citySelectionDataState = (CitySelectionDataState) obj;
                List list2 = citySelectionDataState.f6616a;
                return CitySelectionDataState.a(citySelectionDataState, null, null, null, list2 != null ? CitySelectionComponent.F0(citySelectionComponent, list2, str8) : null, false, false, false, 119);
            case 11:
                List list3 = (List) this.b;
                CitySelectionDataState citySelectionDataState2 = (CitySelectionDataState) obj;
                return CitySelectionDataState.a(citySelectionDataState2, list3, null, null, list3 != null ? CitySelectionComponent.F0((CitySelectionComponent) this.c, list3, citySelectionDataState2.c) : null, false, false, citySelectionDataState2.c.length() > 0, 38);
            case 12:
                MetroFinalFareAppModel metroFinalFareAppModel = (MetroFinalFareAppModel) this.b;
                List list4 = (List) this.c;
                ConfirmBookingScreenDataState it7 = (ConfirmBookingScreenDataState) obj;
                Intrinsics.i(it7, "it");
                return ConfirmBookingScreenDataState.a(it7, null, false, null, null, null, null, Long.valueOf(metroFinalFareAppModel.b), metroFinalFareAppModel.f5428a, list4, false, false, false, 4223);
            case 13:
                ChaloNavigationManagerKt.e(((ConfirmSuperPassPurchaseViewModel) this.b).q, new MinProfileUpdateArgs((String) this.c, ((Boolean) obj).booleanValue(), Source.CONFIRM_SUPER_PASS_PURCHASE_FRAGMENT), null, 6);
                return Unit.f17538a;
            case 14:
                return ContextMenuAreaKt.ContextMenuArea$lambda$1$0((Function0) this.b, (ContextMenuState) this.c, (Offset) obj);
            case 15:
                return CoreTextFieldKt.CoreTextField$lambda$24$0((LegacyTextFieldState) this.b, (Brush) this.c, (ContentDrawScope) obj);
            case 16:
                return Boolean.valueOf(CoreTextFieldSemanticsModifierNode.applySemantics$lambda$4((CoreTextFieldSemanticsModifierNode) this.b, (SemanticsPropertyReceiver) this.c, (AnnotatedString) obj));
            case 17:
                return DatePickerKt.Month$lambda$51$lambda$50((SelectedRangeInfo) this.b, (DatePickerColors) this.c, (ContentDrawScope) obj);
            case 18:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$20$lambda$19((CoroutineScope) this.b, (Animatable) this.c, ((Float) obj).floatValue());
            case 19:
                return DiskLruCache.Editor.newSink$lambda$3$lambda$2((DiskLruCache) this.b, (DiskLruCache.Editor) this.c, (IOException) obj);
            case 20:
                CreateOrderResponseAppModel createOrderResponseAppModel = (CreateOrderResponseAppModel) this.b;
                ElectricityBillAppModel electricityBillAppModel = (ElectricityBillAppModel) this.c;
                Intrinsics.i((EBillPaymentSuccessDataState) obj, "it");
                return new EBillPaymentSuccessDataState(electricityBillAppModel, createOrderResponseAppModel);
            case 21:
                ChaloUseCaseResult.Failure failure = (ChaloUseCaseResult.Failure) this.b;
                EBillAmountIntent.AmountEnteredIntent amountEnteredIntent = (EBillAmountIntent.AmountEnteredIntent) this.c;
                EBillAmountDataState it8 = (EBillAmountDataState) obj;
                Intrinsics.i(it8, "it");
                return EBillAmountDataState.a(it8, false, null, amountEnteredIntent.f2549a, ((EBillAmountException) failure.f10418a).getMsg(), 2);
            case 22:
                ElectricityBillAppModel electricityBillAppModel2 = (ElectricityBillAppModel) this.b;
                String str9 = (String) this.c;
                EBillAmountDataState it9 = (EBillAmountDataState) obj;
                Intrinsics.i(it9, "it");
                return EBillAmountDataState.a(it9, true, electricityBillAppModel2, str9, null, 8);
            case 23:
                return EditProcessor.generateBatchErrorMessage$lambda$0$0((EditCommand) this.b, (EditProcessor) this.c, (EditCommand) obj);
            case 24:
                return EmbeddingCompat.setEmbeddingCallback$lambda$0((EmbeddingInterfaceCompat.EmbeddingCallbackInterface) this.b, (EmbeddingCompat) this.c, (List) obj);
            case 25:
                ExitInterstitialAdManager exitInterstitialAdManager = (ExitInterstitialAdManager) this.b;
                Job job = (Job) this.c;
                synchronized (exitInterstitialAdManager.j) {
                    if (exitInterstitialAdManager.u == job) {
                        exitInterstitialAdManager.u = null;
                    }
                    break;
                }
                return Unit.f17538a;
            case 26:
                return ExposedDropdownMenu_androidKt.SoftKeyboardListener$lambda$5$lambda$4((View) this.b, (Function0) this.c, (DisposableEffectScope) obj);
            case 27:
                return FocusableNode.emitWithFallback$lambda$0((MutableInteractionSource) this.b, (Interaction) this.c, (Throwable) obj);
            case 28:
                return FontFamilyResolverImpl.resolve$lambda$0((FontFamilyResolverImpl) this.b, (TypefaceRequest) this.c, (Function1) obj);
            default:
                ((FreshPurchaseDelegate) this.b).w.remove((Job) this.c);
                return Unit.f17538a;
        }
    }
}
