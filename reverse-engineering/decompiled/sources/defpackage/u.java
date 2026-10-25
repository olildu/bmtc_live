package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.DragHandleColors;
import androidx.compose.material3.DragHandleKt;
import androidx.compose.material3.DragHandleShapes;
import androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import app.chalo.checkout.ui.screen.payment.IndividualModeUiState;
import app.chalo.checkout.ui.screen.payment.ModeItemDetailsUiState;
import app.chalo.checkout.ui.screen.payment.PaymentCardUiSpec;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentDataState;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessScreenDetail;
import app.chalo.compose.components.ComposeUtilsKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.data.ChaloTextDataAppModel;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.data.GridWidgetCardData;
import app.chalo.data.GridWidgetItemData;
import app.chalo.extensions.StringExtsKt;
import app.chalo.home.domain.GetChaloPageItemsUseCase;
import app.chalo.home.domain.GetChaloPageItemsUseCase$getChaloBusProductListItems$$inlined$sortedBy$1;
import app.chalo.home.domain.GetChaloPageItemsUseCase$invoke$$inlined$sortedBy$1;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.chalobus.ChaloBusContractKt;
import app.chalo.home.ui.chalobus.ChaloBusPageDisplayItemData;
import app.chalo.home.ui.chalobus.ChaloBusPageSectionDisplayType;
import app.chalo.home.ui.chalobus.ChaloBusProductItemData;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.home.HomeUnifiedAdUiState;
import app.chalo.home.ui.home.HomeUnifiedAdUiStateTracker;
import app.chalo.homescreen.data.model.app.CardSectionAppModel;
import app.chalo.homescreen.data.model.app.ChaloBusAppModel;
import app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel;
import app.chalo.homescreen.data.model.app.ItemTextDataAppModel;
import app.chalo.homescreen.data.model.app.PassCardDataAppModel;
import app.chalo.homescreen.data.model.app.PlotlineWidgetSectionAppModel;
import app.chalo.homescreen.data.model.app.ProductPurchaseSectionAppModel;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.a;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.multimodalticket.data.model.app.GroupTicketBookingFareResponseAppModel;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionBottomSheetDataStateType;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.ncmc.data.cardtransactions.CardMerchantTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardRechargePaymentMode;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareInfoAppModel;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailComponent;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailViewIntent;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailViewState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionTypeUiModel;
import app.chalo.network.ChaloAuthSecureManager;
import app.chalo.network.CommonHeaderProvider;
import app.chalo.network.logging.ChaloInternalNetworkInspector;
import app.chalo.network.logging.ChaloInternalNetworkInspectorKt;
import app.chalo.network.rest.generic.ChaloAuthConfig;
import app.chalo.network.rest.generic.ChaloAuthConfigHandler;
import app.chalo.network.rest.generic.ChaloAuthPluginKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionLayoutType;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.onboarding.citylocationselection.ui.WelcomeScreenConfig;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewScreenKt;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperProofImageUIState;
import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.text.TextUIState;
import app.chalo.usecase.FeedbackTags;
import com.android.volley.toolbox.HttpHeaderParser;
import defpackage.i41;
import defpackage.pk0;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.engine.UtilsKt;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.DefaultRequestKt;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.cache.HttpCacheKt;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.network.util.Timeout;
import io.ktor.util.AttributeKey;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19701a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(int i, Object obj, Object obj2, Object obj3) {
        this.f19701a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:186:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v30, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r13v29, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        HomeUnifiedAdUiState homeUnifiedAdUiState;
        String string;
        String strValueOf;
        int i4 = this.f19701a;
        int i5 = 10;
        int i6 = 0;
        int i7 = 1;
        Unit unit = Unit.f17538a;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (i4) {
            case 0:
                return AccessibilityServiceStateProvider_androidKt.ObserveState$lambda$12$lambda$11((LifecycleOwner) obj4, (Function1) obj3, (Function0) obj2, (DisposableEffectScope) obj);
            case 1:
                return AndroidViewBindingKt.AndroidViewBinding$lambda$7$0((Function1) obj3, (Fragment) obj4, (Context) obj2, (View) obj);
            case 2:
                return AppBarKt.settleAppBar$lambda$54((Ref.FloatRef) obj4, (TopAppBarState) obj3, (Ref.FloatRef) obj2, (AnimationScope) obj);
            case 3:
                return AppBarKt.settleAppBarBottom$lambda$29((Ref.FloatRef) obj4, (BottomAppBarState) obj3, (Ref.FloatRef) obj2, (AnimationScope) obj);
            case 4:
                return BasicTextFieldKt.BasicTextField$lambda$24$0((Function1) obj3, (MutableState) obj4, (MutableState) obj2, (TextFieldValue) obj);
            case 5:
                return BasicTooltipKt.anchorSemantics$lambda$12((String) obj4, (CoroutineScope) obj3, (TooltipState) obj2, (SemanticsPropertyReceiver) obj);
            case 6:
                return androidx.compose.foundation.BasicTooltipKt.anchorSemantics$lambda$0((String) obj4, (CoroutineScope) obj3, (BasicTooltipState) obj2, (SemanticsPropertyReceiver) obj);
            case 7:
                Timeout timeout = (Timeout) obj4;
                Ref.IntRef intRef = (Ref.IntRef) obj3;
                WritableByteChannel writableByteChannel = (WritableByteChannel) obj2;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                while (byteBuffer.hasRemaining()) {
                    if (timeout == null) {
                        do {
                            intRef.element = writableByteChannel.write(byteBuffer);
                            if (!byteBuffer.hasRemaining()) {
                            }
                        } while (intRef.element > 0);
                    } else {
                        timeout.a();
                        do {
                            try {
                                intRef.element = writableByteChannel.write(byteBuffer);
                                if (byteBuffer.hasRemaining()) {
                                    break;
                                }
                                timeout.b();
                            } catch (Throwable th) {
                                timeout.b();
                                throw th;
                            }
                        } while (intRef.element > 0);
                        timeout.b();
                    }
                    break;
                }
                return unit;
            case 8:
                CardRechargeTransactionAppModel cardRechargeTransactionAppModel = (CardRechargeTransactionAppModel) obj3;
                CardTransactionDetailComponent cardTransactionDetailComponent = (CardTransactionDetailComponent) obj2;
                CardTransactionDetailViewState it = (CardTransactionDetailViewState) obj;
                Intrinsics.i(it, "it");
                CardTransactionTypeUiModel cardTransactionTypeUiModel = ((CardTransactionDetailViewIntent.InitializationIntent) obj4).b;
                String str = cardRechargeTransactionAppModel.f6174a;
                String strJ = cardTransactionDetailComponent.k.j(cardRechargeTransactionAppModel.b);
                CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel = cardRechargeTransactionAppModel.c;
                List list = cardTransactionFareInfoAppModel.b;
                String strA = cardTransactionDetailComponent.m.a(cardTransactionFareInfoAppModel.f6190a, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                CardRechargePaymentMode cardRechargePaymentMode = cardRechargeTransactionAppModel.d;
                return new CardTransactionDetailViewState(cardTransactionTypeUiModel, str, strJ, list, null, null, null, 0, null, strA, false, cardRechargePaymentMode != null ? cardRechargePaymentMode.name() : null);
            case 9:
                CardMerchantTransactionAppModel cardMerchantTransactionAppModel = (CardMerchantTransactionAppModel) obj3;
                CardTransactionDetailComponent cardTransactionDetailComponent2 = (CardTransactionDetailComponent) obj2;
                CardTransactionDetailViewState it2 = (CardTransactionDetailViewState) obj;
                Intrinsics.i(it2, "it");
                CardTransactionTypeUiModel cardTransactionTypeUiModel2 = ((CardTransactionDetailViewIntent.InitializationIntent) obj4).b;
                String str2 = cardMerchantTransactionAppModel.f6166a;
                String strJ2 = cardTransactionDetailComponent2.k.j(cardMerchantTransactionAppModel.b);
                CardTransactionFareInfoAppModel cardTransactionFareInfoAppModel2 = cardMerchantTransactionAppModel.c;
                return new CardTransactionDetailViewState(cardTransactionTypeUiModel2, str2, strJ2, cardTransactionFareInfoAppModel2.b, null, null, null, 0, null, cardTransactionDetailComponent2.m.a(cardTransactionFareInfoAppModel2.f6190a, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), false, null);
            case 10:
                ChaloBusComponent chaloBusComponent = (ChaloBusComponent) obj4;
                ChaloBusAppModel chaloBusAppModel = (ChaloBusAppModel) obj3;
                List list2 = (List) obj2;
                ChaloBusViewState chaloBusViewState = (ChaloBusViewState) obj;
                boolean zBooleanValue = ((Boolean) chaloBusComponent.o.getG().getValue()).booleanValue();
                TabMetaDataAppModel tabMetaDataAppModel = chaloBusAppModel.b;
                GetChaloPageItemsUseCase getChaloPageItemsUseCase = chaloBusComponent.k;
                List chaloPageSections = chaloBusAppModel.f3721a;
                getChaloPageItemsUseCase.getClass();
                Intrinsics.i(chaloPageSections, "chaloPageSections");
                ArrayList arrayList3 = new ArrayList();
                List listV0 = CollectionsKt.v0(new GetChaloPageItemsUseCase$invoke$$inlined$sortedBy$1(), chaloPageSections);
                int i8 = 0;
                while (i8 < listV0.size()) {
                    ChaloBusWidgetSectionAppModel chaloBusWidgetSectionAppModel = (ChaloBusWidgetSectionAppModel) listV0.get(i8);
                    if (chaloBusWidgetSectionAppModel instanceof ChaloBusWidgetSectionAppModel.TicketsPassesSection) {
                        CardSectionAppModel cardSectionAppModel = ((ChaloBusWidgetSectionAppModel.TicketsPassesSection) chaloBusWidgetSectionAppModel).k;
                        arrayList3.add(new ChaloBusPageDisplayItemData(chaloBusWidgetSectionAppModel.d, null, null, cardSectionAppModel.f3719a, null, null, cardSectionAppModel.b, ChaloBusContractKt.a(chaloBusWidgetSectionAppModel.c), ChaloBusPageSectionDisplayType.CARD, null, null, 1590));
                    } else {
                        if (chaloBusWidgetSectionAppModel instanceof ChaloBusWidgetSectionAppModel.CustomerSupportSection) {
                            boolean z = chaloBusWidgetSectionAppModel.d;
                            CardSectionAppModel cardSectionAppModel2 = ((ChaloBusWidgetSectionAppModel.CustomerSupportSection) chaloBusWidgetSectionAppModel).k;
                            arrayList3.add(new ChaloBusPageDisplayItemData(z, null, null, cardSectionAppModel2.f3719a, null, null, cardSectionAppModel2.b, ChaloBusContractKt.a(chaloBusWidgetSectionAppModel.c), ChaloBusPageSectionDisplayType.CARD, null, null, 1590));
                        } else if (chaloBusWidgetSectionAppModel instanceof ChaloBusWidgetSectionAppModel.PlotlineSection) {
                            i3 = i7;
                            while (i8 < listV0.size() && (listV0.get(i8) instanceof ChaloBusWidgetSectionAppModel.PlotlineSection)) {
                                Object obj5 = listV0.get(i8);
                                Intrinsics.g(obj5, "null cannot be cast to non-null type app.chalo.homescreen.data.model.app.ChaloBusWidgetSectionAppModel.PlotlineSection");
                                ChaloBusWidgetSectionAppModel.PlotlineSection plotlineSection = (ChaloBusWidgetSectionAppModel.PlotlineSection) obj5;
                                PlotlineWidgetSectionAppModel plotlineWidgetSectionAppModel = plotlineSection.k;
                                if (plotlineWidgetSectionAppModel.d.length() > 0) {
                                    arrayList3.add(new ChaloBusPageDisplayItemData(plotlineSection.d, plotlineWidgetSectionAppModel.d, plotlineWidgetSectionAppModel.b, plotlineWidgetSectionAppModel.f3776a, plotlineWidgetSectionAppModel.c, null, null, ChaloBusContractKt.a(plotlineSection.c), ChaloBusPageSectionDisplayType.PLOTLINE_WIDGET, null, null, 1632));
                                }
                                i8++;
                                i3 = i6;
                            }
                            tabMetaDataAppModel = tabMetaDataAppModel;
                            listV0 = listV0;
                            i = i8;
                            i5 = i5;
                        } else {
                            if (chaloBusWidgetSectionAppModel instanceof ChaloBusWidgetSectionAppModel.PremiumBusProductPurchaseSection) {
                                ProductPurchaseSectionAppModel productPurchaseSectionAppModel = ((ChaloBusWidgetSectionAppModel.PremiumBusProductPurchaseSection) chaloBusWidgetSectionAppModel).k;
                                String str3 = productPurchaseSectionAppModel.f3778a;
                                String str4 = productPurchaseSectionAppModel.c;
                                ChaloCtaDisplayType chaloCtaDisplayType = productPurchaseSectionAppModel.d;
                                boolean z2 = chaloBusWidgetSectionAppModel.d;
                                List list3 = productPurchaseSectionAppModel.e;
                                ArrayList arrayList4 = new ArrayList();
                                for (PassCardDataAppModel passCardDataAppModel : CollectionsKt.v0(new GetChaloPageItemsUseCase$getChaloBusProductListItems$$inlined$sortedBy$1(), list3)) {
                                    ItemTextDataAppModel itemTextDataAppModel = passCardDataAppModel.d;
                                    ChaloTextWithBackgroundData chaloTextWithBackgroundDataA = GetChaloPageItemsUseCase.a(itemTextDataAppModel.c);
                                    TabMetaDataAppModel tabMetaDataAppModel2 = tabMetaDataAppModel;
                                    List list4 = itemTextDataAppModel.f3757a;
                                    if (list4 != null) {
                                        List list5 = list4;
                                        arrayList = new ArrayList(CollectionsKt.v(list5, 10));
                                        Iterator it3 = list5.iterator();
                                        while (it3.hasNext()) {
                                            arrayList.add(GetChaloPageItemsUseCase.a((ChaloTextDataAppModel) it3.next()));
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    List list6 = itemTextDataAppModel.b;
                                    if (list6 != null) {
                                        List list7 = list6;
                                        i2 = 10;
                                        arrayList2 = new ArrayList(CollectionsKt.v(list7, 10));
                                        Iterator it4 = list7.iterator();
                                        while (it4.hasNext()) {
                                            arrayList2.add(GetChaloPageItemsUseCase.a((ChaloTextDataAppModel) it4.next()));
                                        }
                                    } else {
                                        i2 = 10;
                                        arrayList2 = null;
                                    }
                                    arrayList4.add(new ChaloBusProductItemData(new GridWidgetCardData(new GridWidgetItemData(arrayList, arrayList2, chaloTextWithBackgroundDataA), passCardDataAppModel.b, passCardDataAppModel.f, StringExtsKt.b(passCardDataAppModel.f3772a, "#00000000")), passCardDataAppModel.e));
                                    listV0 = listV0;
                                    i5 = i2;
                                    tabMetaDataAppModel = tabMetaDataAppModel2;
                                    i8 = i8;
                                }
                                tabMetaDataAppModel = tabMetaDataAppModel;
                                listV0 = listV0;
                                i = i8;
                                i5 = i5;
                                arrayList3.add(new ChaloBusPageDisplayItemData(z2, null, null, str3, null, arrayList4, null, ChaloBusContractKt.a(chaloBusWidgetSectionAppModel.c), ChaloBusPageSectionDisplayType.PRODUCT_PURCHASE, str4, chaloCtaDisplayType, 86));
                            } else {
                                tabMetaDataAppModel = tabMetaDataAppModel;
                                listV0 = listV0;
                                i = i8;
                                i5 = i5;
                                if (chaloBusWidgetSectionAppModel instanceof ChaloBusWidgetSectionAppModel.PassPurchaseSection) {
                                    CardSectionAppModel cardSectionAppModel3 = ((ChaloBusWidgetSectionAppModel.PassPurchaseSection) chaloBusWidgetSectionAppModel).k;
                                    arrayList3.add(new ChaloBusPageDisplayItemData(chaloBusWidgetSectionAppModel.d, null, null, cardSectionAppModel3.f3719a, cardSectionAppModel3.c, null, cardSectionAppModel3.b, ChaloBusContractKt.a(chaloBusWidgetSectionAppModel.c), ChaloBusPageSectionDisplayType.CARD, null, null, 1574));
                                } else if (!(chaloBusWidgetSectionAppModel instanceof ChaloBusWidgetSectionAppModel.Unknown)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            i3 = 1;
                        }
                        if (i3 != 0) {
                            i6 = 0;
                            i7 = 1;
                            i8 = i + 1;
                        } else {
                            i8 = i;
                            i6 = 0;
                            i7 = 1;
                        }
                    }
                    tabMetaDataAppModel = tabMetaDataAppModel;
                    listV0 = listV0;
                    i = i8;
                    i5 = i5;
                    i3 = 1;
                    if (i3 != 0) {
                        i6 = 0;
                        i7 = 1;
                        i8 = i + 1;
                    } else {
                        i8 = i;
                        i6 = 0;
                        i7 = 1;
                    }
                }
                return ChaloBusViewState.a(chaloBusViewState, arrayList3, false, 0, null, null, tabMetaDataAppModel, null, null, false, null, null, null, null, null, null, null, null, null, zBooleanValue, list2, false, null, null, null, null, 262143934);
            case 11:
                Modifier conditional = (Modifier) obj;
                Intrinsics.i(conditional, "$this$conditional");
                return ClickableKt.m295clickableO2vRcR0$default(conditional, (MutableInteractionSource) obj4, (Indication) obj3, false, null, null, new im((TextUIState.ChaloTextUIState) obj2, 1), 28, null);
            case 12:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj4;
                Function2 function2 = (Function2) obj3;
                MutableState mutableState = (MutableState) obj2;
                FeedbackTags it5 = (FeedbackTags) obj;
                Intrinsics.i(it5, "it");
                if (snapshotStateList.contains(it5)) {
                    snapshotStateList.remove(it5);
                } else {
                    snapshotStateList.add(it5);
                }
                function2.invoke(snapshotStateList, (String) mutableState.getValue());
                return unit;
            case 13:
                final List list8 = (List) obj4;
                final PaymentCardUiSpec paymentCardUiSpec = (PaymentCardUiSpec) obj3;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyColumn.items(list8.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.checkout.ui.payment.CheckoutItemListKt$ScrollablePaymentMethodListView$lambda$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        list8.get(((Number) obj6).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.checkout.ui.payment.CheckoutItemListKt$ScrollablePaymentMethodListView$lambda$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i9;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj6;
                        int iIntValue = ((Number) obj7).intValue();
                        Composer composer = (Composer) obj8;
                        int iIntValue2 = ((Number) obj9).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i9 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i9 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i9 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i9, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            final IndividualModeUiState individualModeUiState = (IndividualModeUiState) list8.get(iIntValue);
                            composer.startReplaceGroup(-1056732838);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = individualModeUiState.d;
                            ModeItemDetailsUiState modeItemDetailsUiState = individualModeUiState.b;
                            boolean z3 = uiEventHandler$Companion$fromLambda$1 != null;
                            boolean zChanged = composer.changed(individualModeUiState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: app.chalo.checkout.ui.payment.CheckoutItemListKt$ScrollablePaymentMethodListView$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = individualModeUiState.d;
                                        if (uiEventHandler$Companion$fromLambda$2 != null) {
                                            uiEventHandler$Companion$fromLambda$2.a();
                                        }
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            PaymentMethodListItemKt.b(ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(companion, z3, null, null, null, (Function0) objRememberedValue, 14, null), paymentCardUiSpec.c), modeItemDetailsUiState.f1518a, modeItemDetailsUiState.b, modeItemDetailsUiState.f, modeItemDetailsUiState.g, modeItemDetailsUiState.d, modeItemDetailsUiState.e, modeItemDetailsUiState.c, composer, 0);
                            DividerUIState dividerUIState = individualModeUiState.c;
                            if (dividerUIState == null) {
                                composer.startReplaceGroup(-1055959235);
                            } else {
                                composer.startReplaceGroup(-1055959234);
                                DividerUIStateKt.a(ChaloThemeKt.c(companion, modeItemDetailsUiState.f1518a.g), dividerUIState, composer, 0, 0);
                            }
                            composer.endReplaceGroup();
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
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1230937664, true, new d0(22, (ClickableTextUiState) obj2, paymentCardUiSpec)), 3, null);
                return unit;
            case 14:
                PostPaymentSuccessProductType.SuperPass superPass = (PostPaymentSuccessProductType.SuperPass) obj4;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                PostPaymentDataState it6 = (PostPaymentDataState) obj;
                Intrinsics.i(it6, "it");
                return PostPaymentDataState.a(it6, false, new PostPaymentSuccessScreenDetail(new PostPaymentSuccessProductType.SuperPass(superPass.f1590a, superPass.b, superPass.c, superPass.d, superPass.e), str6, superPass.e ? str5 : null, LottieType.NEW_PAYMENT_SUCCESS, 368), null, 4);
            case 15:
                PostPaymentDataState it7 = (PostPaymentDataState) obj;
                Intrinsics.i(it7, "it");
                return PostPaymentDataState.a(it7, false, new PostPaymentSuccessScreenDetail(new PostPaymentSuccessProductType.PremiumReserveTicket(((PremiumReserveTicketAppModel) obj4).f7113a.f7114a), (String) obj3, (String) obj2, LottieType.NEW_PAYMENT_SUCCESS, 496), null, 4);
            case 16:
                return CityLocationSelectionState.a((CityLocationSelectionState) obj, false, null, CityLocationSelectionLayoutType.CityWelcome, (String) obj4, (String) obj3, null, (WelcomeScreenConfig) obj2, false, null, false, 1954);
            case 17:
                final List list9 = (List) obj4;
                final ChaloPadding chaloPadding = (ChaloPadding) obj3;
                final DividerUIState dividerUIState = (DividerUIState) obj2;
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn2, "$this$LazyColumn");
                LazyColumn2.items(list9.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt$CitySelectionList$lambda$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        list9.get(((Number) obj6).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.onboarding.cityselection.ui.CitySelectionScreenKt$CitySelectionList$lambda$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i9;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj6;
                        int iIntValue = ((Number) obj7).intValue();
                        Composer composer = (Composer) obj8;
                        int iIntValue2 = ((Number) obj9).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i9 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i9 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i9 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i9, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            CitySelectionListItemsUIState citySelectionListItemsUIState = (CitySelectionListItemsUIState) list9.get(iIntValue);
                            composer.startReplaceGroup(535172030);
                            if (citySelectionListItemsUIState instanceof CitySelectionListItemsUIState.CityListItemUIState) {
                                composer.startReplaceGroup(535227426);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                                pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i10), composerM3915constructorimpl));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                if (iIntValue != 0) {
                                    composer.startReplaceGroup(672002118);
                                    DividerUIStateKt.a(ChaloThemeKt.c(companion, chaloPadding), dividerUIState, composer, 0, 0);
                                } else {
                                    composer.startReplaceGroup(660367539);
                                }
                                composer.endReplaceGroup();
                                CitySelectionListItemsUIState.CityListItemUIState cityListItemUIState = (CitySelectionListItemsUIState.CityListItemUIState) citySelectionListItemsUIState;
                                Modifier modifierB = ComposeUtilsKt.b(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), cityListItemUIState.e), cityListItemUIState.d, composer, 0, 6);
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierB);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor2);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
                                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i11), composerM3915constructorimpl2));
                                Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
                                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierA);
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor3);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
                                pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i12), composerM3915constructorimpl3));
                                TextKt.c(cityListItemUIState.f6625a, ChaloThemeKt.c(companion, cityListItemUIState.f), null, null, composer, 0, 12);
                                if (cityListItemUIState.b == null) {
                                    composer.startReplaceGroup(324595300);
                                } else {
                                    composer.startReplaceGroup(324595301);
                                    TextKt.c(cityListItemUIState.b, null, null, null, composer, 0, 14);
                                }
                                composer.endReplaceGroup();
                                composer.endNode();
                                if (cityListItemUIState.c == null) {
                                    composer.startReplaceGroup(1698473213);
                                } else {
                                    composer.startReplaceGroup(1698473214);
                                    CommonImageKt.a(cityListItemUIState.c, ChaloThemeKt.c(companion, cityListItemUIState.g), false, composer, 0, 4);
                                    composer = composer;
                                }
                                composer.endReplaceGroup();
                                composer.endNode();
                                composer.endNode();
                                composer.endReplaceGroup();
                            } else {
                                if (!(citySelectionListItemsUIState instanceof CitySelectionListItemsUIState.CityListFooterUIState)) {
                                    throw pk0.p(composer, -814020379);
                                }
                                composer.startReplaceGroup(536800490);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                CitySelectionListItemsUIState.CityListFooterUIState cityListFooterUIState = (CitySelectionListItemsUIState.CityListFooterUIState) citySelectionListItemsUIState;
                                Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloColorTokenKt.c(cityListFooterUIState.e), null, 2, null), cityListFooterUIState.c);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
                                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                                int i13 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierC);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                if (composer.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor4);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer);
                                pk0.v(companion5, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i13), composerM3915constructorimpl4));
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                TextKt.c(cityListFooterUIState.f6624a, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, null, composer, 48, 12);
                                ChaloFilledButtonKt.a(0, 0, composer, ChaloThemeKt.c(companion4, cityListFooterUIState.d), cityListFooterUIState.b);
                                composer.endNode();
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
                return unit;
            case 18:
                final List list10 = (List) obj4;
                final Function1 function1 = (Function1) obj3;
                final TextFieldValue textFieldValue = (TextFieldValue) obj2;
                LazyListScope LazyColumn3 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn3, "$this$LazyColumn");
                LazyColumn3.items(list10.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt$CityUniversalSearchListComposable$lambda$1$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        list10.get(((Number) obj6).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt$CityUniversalSearchListComposable$lambda$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i9;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj6;
                        int iIntValue = ((Number) obj7).intValue();
                        Composer composer = (Composer) obj8;
                        int iIntValue2 = ((Number) obj9).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i9 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i9 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i9 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i9, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            UniversalSearchItem universalSearchItem = (UniversalSearchItem) list10.get(iIntValue);
                            composer.startReplaceGroup(225566348);
                            if ((universalSearchItem instanceof UniversalSearchItem.HeaderItem) || (universalSearchItem instanceof UniversalSearchItem.RouteList)) {
                                composer.startReplaceGroup(225668957);
                                composer.endReplaceGroup();
                            } else {
                                if (!(universalSearchItem instanceof UniversalSearchItem.PlacesAndStopsItem)) {
                                    throw pk0.p(composer, 1392749655);
                                }
                                composer.startReplaceGroup(225740815);
                                CitySelectionUniversalPickerScreenKt.c((UniversalSearchItem.PlacesAndStopsItem) universalSearchItem, function1, textFieldValue, composer, 0);
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
                return unit;
            case 19:
                final List list11 = (List) obj4;
                final ChaloPadding chaloPadding2 = (ChaloPadding) obj3;
                final ImageUISize imageUISize = (ImageUISize) obj2;
                LazyListScope LazyRow = (LazyListScope) obj;
                Intrinsics.i(LazyRow, "$this$LazyRow");
                LazyRow.items(list11.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt$ConfirmPassUploadedProofContent$lambda$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        list11.get(((Number) obj6).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassScreenKt$ConfirmPassUploadedProofContent$lambda$0$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj6, Object obj7, Object obj8, Object obj9) {
                        int i9;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj6;
                        int iIntValue = ((Number) obj7).intValue();
                        Composer composer = (Composer) obj8;
                        int iIntValue2 = ((Number) obj9).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i9 = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i9 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i9 |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(802480018, i9, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                            }
                            SuperProofImageUIState superProofImageUIState = (SuperProofImageUIState) list11.get(iIntValue);
                            composer.startReplaceGroup(1140550862);
                            SuperPassProofOverviewScreenKt.l(superProofImageUIState, ClipKt.clip(ImageUIStateKt.b(ChaloThemeKt.c(Modifier.INSTANCE, chaloPadding2), imageUISize), ChaloThemeKt.d(superProofImageUIState.e)), composer, 0, 0);
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
                return unit;
            case 20:
                return CoreTextFieldKt.CoreTextField$lambda$19$0((LegacyTextFieldState) obj4, (TextFieldValue) obj3, (OffsetMapping) obj2, (DrawScope) obj);
            case 21:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0((TextContextMenuData) obj4, (Context) obj3, (TextContextMenuSession) obj2, (ContextMenuScope) obj);
            case 22:
                return DragHandleKt.VerticalDragHandle$lambda$10$lambda$9((DragHandleShapes) obj4, (State) obj3, (MutableState) obj2, (GraphicsLayerScope) obj);
            case 23:
                return DragHandleKt.VerticalDragHandle$lambda$15$lambda$14((DragHandleColors) obj4, (State) obj3, (MutableState) obj2, (DrawScope) obj);
            case 24:
                BottomDrawerState bottomDrawerState = (BottomDrawerState) obj3;
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                TweenSpec tweenSpec = DrawerKt.f4449a;
                Intrinsics.i(semantics, "$this$semantics");
                SemanticsPropertiesKt.setPaneTitle(semantics, (String) obj4);
                if (bottomDrawerState.c.getValue() != BottomDrawerValue.Closed) {
                    SemanticsPropertiesKt.dismiss$default(semantics, null, new a(bottomDrawerState, coroutineScope, 2), 1, null);
                }
                return unit;
            case 25:
                return EnterAlwaysSearchBarScrollBehavior.Companion.Saver$lambda$1((Function0) obj2, (AnimationSpec) obj4, (DecayAnimationSpec) obj3, (List) obj);
            case 26:
                GroupTicketBookingFareResponseAppModel groupTicketBookingFareResponseAppModel = (GroupTicketBookingFareResponseAppModel) obj4;
                GroupTicketLegSelectionDataState it8 = (GroupTicketLegSelectionDataState) obj;
                Intrinsics.i(it8, "it");
                return GroupTicketLegSelectionDataState.a(it8, null, false, new GroupTicketLegSelectionBottomSheetDataStateType.PassengerSelectionType((List) obj3), null, null, (LinkedHashMap) obj2, groupTicketBookingFareResponseAppModel.b, groupTicketBookingFareResponseAppModel.f5849a, 25);
            case 27:
                HomeUnifiedAdUiStateTracker homeUnifiedAdUiStateTracker = (HomeUnifiedAdUiStateTracker) obj4;
                String str7 = (String) obj3;
                MutableState mutableState2 = (MutableState) obj2;
                ((Integer) obj).getClass();
                homeUnifiedAdUiStateTracker.getClass();
                if (Intrinsics.d(homeUnifiedAdUiStateTracker.b, str7)) {
                    homeUnifiedAdUiStateTracker.c = new HomeUnifiedAdUiState(0, 0, false, false);
                    homeUnifiedAdUiStateTracker.f3583a.put(str7, Boolean.FALSE);
                    homeUnifiedAdUiState = homeUnifiedAdUiStateTracker.c;
                } else {
                    homeUnifiedAdUiState = homeUnifiedAdUiStateTracker.c;
                }
                mutableState2.setValue(homeUnifiedAdUiState);
                return unit;
            case 28:
                OutgoingContent outgoingContent = (OutgoingContent) obj4;
                ?? r13 = (FunctionReferenceImpl) obj3;
                ?? r12 = (FunctionReferenceImpl) obj2;
                String header = (String) obj;
                Logger logger = HttpCacheKt.f16695a;
                Intrinsics.i(header, "header");
                List list12 = HttpHeaders.f16799a;
                if (header.equals("Content-Length")) {
                    Long g = outgoingContent.getF16647a();
                    if (g != null && (strValueOf = String.valueOf(g.longValue())) != null) {
                        return strValueOf;
                    }
                } else {
                    if (!header.equals(HttpHeaderParser.HEADER_CONTENT_TYPE)) {
                        if (!header.equals("User-Agent")) {
                            List listB = outgoingContent.c().b(header);
                            if (listB == null && (listB = (List) r12.invoke(header)) == null) {
                                listB = EmptyList.f17557a;
                            }
                            return CollectionsKt.O(listB, ";", null, null, null, 62);
                        }
                        String str8 = outgoingContent.c().get("User-Agent");
                        if (str8 != null) {
                            return str8;
                        }
                        String str9 = (String) r13.invoke("User-Agent");
                        if (str9 != null) {
                            return str9;
                        }
                        Set set = UtilsKt.f16623a;
                        return "ktor-client";
                    }
                    ContentType b = outgoingContent.getB();
                    if (b != null && (string = b.toString()) != null) {
                        return string;
                    }
                }
                return "";
            default:
                final ChaloAuthSecureManager chaloAuthSecureManager = (ChaloAuthSecureManager) obj4;
                ChaloInternalNetworkInspector chaloInternalNetworkInspector = (ChaloInternalNetworkInspector) obj2;
                HttpClientConfig HttpClient = (HttpClientConfig) obj;
                Intrinsics.i(HttpClient, "$this$HttpClient");
                HttpClient.a(ContentNegotiationKt.d, new y80(3));
                HttpClient.a(ChaloAuthPluginKt.f6510a, new Function1() { // from class: app.chalo.network.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        ChaloAuthConfig install = (ChaloAuthConfig) obj6;
                        Intrinsics.i(install, "$this$install");
                        ChaloAuthSecureManager chaloAuthSecureManager2 = chaloAuthSecureManager;
                        install.f6506a = new ChaloAuthConfigHandler(new HttpClientHelper$setupChaloAuth$1$1$1(chaloAuthSecureManager2, null), new HttpClientHelper$setupChaloAuth$1$1$2(1, chaloAuthSecureManager2, ChaloAuthSecureManager.class, "refreshToken", "refreshToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new HttpClientHelper$setupChaloAuth$1$1$3(2, chaloAuthSecureManager2, ChaloAuthSecureManager.class, "onRetryLimitExceeded", "onRetryLimitExceeded(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 4);
                        return Unit.f17538a;
                    }
                });
                b90 b90Var = new b90((CommonHeaderProvider) obj3, i6);
                Logger logger2 = DefaultRequestKt.f16642a;
                HttpClient.a(DefaultRequest.b, new qp(b90Var, i5));
                if (!chaloInternalNetworkInspector.equals(ChaloInternalNetworkInspector.DisabledInspector.f6464a)) {
                    AttributeKey attributeKey = ChaloInternalNetworkInspectorKt.f6465a;
                    HttpClient.a(CreatePluginUtilsKt.a("internalNetworkInspector", new fi(chaloInternalNetworkInspector, 6), new app.chalo.network.logging.a()), new y80(i7));
                }
                return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u(OutgoingContent outgoingContent, Function1 function1, Function1 function2) {
        this.f19701a = 28;
        this.c = outgoingContent;
        this.b = (FunctionReferenceImpl) function1;
        this.d = (FunctionReferenceImpl) function2;
    }

    public /* synthetic */ u(Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec) {
        this.f19701a = 25;
        this.d = function0;
        this.c = animationSpec;
        this.b = decayAnimationSpec;
    }

    public /* synthetic */ u(Function1 function1, Object obj, Object obj2, int i) {
        this.f19701a = i;
        this.b = function1;
        this.c = obj;
        this.d = obj2;
    }
}
