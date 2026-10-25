package app.chalo.productsummary.ui.ticket;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.data.CardRechargePaymentStatus;
import app.chalo.data.CardRechargeStatus;
import app.chalo.data.CardRechargeSummaryData;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.history.uistate.chalobusticket.BusTicketStatusUiState;
import app.chalo.productsummary.ui.data.BookingDetailsUIState;
import app.chalo.productsummary.ui.data.DashedLineUIState;
import app.chalo.productsummary.ui.data.FareBreakupUIState;
import app.chalo.productsummary.ui.data.PriceDetailsUIState;
import app.chalo.productsummary.ui.data.ProductSummaryStatusUiData;
import app.chalo.productsummary.ui.data.RouteDetailInfoUIState;
import app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState;
import app.chalo.productsummary.ui.domain.GetProductStatusUIForSummaryScreen;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.ProductReceiptData;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.utils.CardNumberMaskingHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.wallet.WalletConstants;
import defpackage.py;
import defpackage.we;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CardSummaryUIStateMapperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8786a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CardRechargeStatus.values().length];
            try {
                iArr[CardRechargeStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardRechargeStatus.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardRechargeStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8786a = iArr;
            int[] iArr2 = new int[CardRechargePaymentStatus.values().length];
            try {
                iArr2[CardRechargePaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CardRechargePaymentStatus.INITIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CardRechargePaymentStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(CardRechargeSummaryData cardRechargeSummaryData, CurrencyFeature currencyFeature, StringProvider stringProvider, ContinuationImpl continuationImpl) {
        CardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1 cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof CardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1) {
            cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1 = (CardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1) continuationImpl;
            int i = cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1 = new CardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1(continuationImpl);
            }
        } else {
            cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1 = new CardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1(continuationImpl);
        }
        Object obj = cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (cardRechargeSummaryData.b.length() <= 0) {
                return null;
            }
            String strA = CardNumberMaskingHelper.a(cardRechargeSummaryData.b);
            Object objA = currencyFeature.a(cardRechargeSummaryData.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            TextUIState.ChaloTextUIState chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper2, strA, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.L$0 = chaloTextUIStateG;
            cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.L$1 = chaloTextStyleHelper2;
            cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.label = 1;
            Object objB = stringProvider.b(StringEnum.CARD_RECHARGE_CONFIRMATION_SUBTITLE, new Object[]{objA}, cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1);
            if (objB == obj2) {
                return obj2;
            }
            chaloTextUIState = chaloTextUIStateG;
            chaloTextStyleHelper = chaloTextStyleHelper2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.L$1;
            chaloTextUIState = (TextUIState.ChaloTextUIState) cardSummaryUIStateMapperKt$createCardRechargeTicketInfoUIState$1.L$0;
            ResultKt.b(obj);
            chaloTextStyleHelper = chaloTextStyleHelper3;
        }
        return new TicketInfoUIState(CollectionsKt.R(new TicketInfoContentUIState.ValidatedAt(new TitleSubtitleUiState(null, chaloTextUIState, ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9))), null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0166  */
    /* JADX WARN: Code duplicated, block: B:50:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:0x0199  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object b(ProductReceiptData productReceiptData, String str, TimeUtilsContract timeUtilsContract, StringProvider stringProvider, ContinuationImpl continuationImpl) {
        CardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1 cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1;
        ArrayList arrayListL;
        String str2;
        TimeUtilsContract timeUtilsContract2;
        List list;
        Object obj;
        ChaloTextStyleHelper chaloTextStyleHelper;
        StringProvider stringProvider2;
        List list2;
        TimeUtilsContract timeUtilsContract3;
        List list3;
        Long l;
        Object objB;
        List list4;
        ProductReceiptData productReceiptData2;
        List list5;
        String str3;
        TimeUtilsContract timeUtilsContract4;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        List list6;
        String e;
        int i;
        ProductReceiptData productReceiptData3 = productReceiptData;
        StringProvider stringProvider3 = stringProvider;
        if (continuationImpl instanceof CardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1) {
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1 = (CardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1) continuationImpl;
            int i2 = cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1 = new CardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1(continuationImpl);
            }
        } else {
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1 = new CardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1(continuationImpl);
        }
        Object obj2 = cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.label;
        DividerUIState dividerUIState = null;
        ChaloTextStyleHelper chaloTextStyleHelper3 = ChaloTextStyleHelper.f10078a;
        if (i3 != 0) {
            if (i3 == 1) {
                ChaloTextStyleHelper chaloTextStyleHelper4 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$6;
                List list7 = (List) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$5;
                List list8 = (List) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$4;
                StringProvider stringProvider4 = (StringProvider) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$3;
                TimeUtilsContract timeUtilsContract5 = (TimeUtilsContract) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$2;
                String str4 = (String) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$1;
                ProductReceiptData productReceiptData4 = (ProductReceiptData) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$0;
                ResultKt.b(obj2);
                chaloTextStyleHelper = chaloTextStyleHelper4;
                obj = obj2;
                list6 = list8;
                stringProvider2 = stringProvider4;
                str2 = str4;
                productReceiptData3 = productReceiptData4;
                list2 = list7;
                timeUtilsContract3 = timeUtilsContract5;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChaloTextStyleHelper chaloTextStyleHelper5 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$5;
                List list9 = (List) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$4;
                List list10 = (List) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$3;
                timeUtilsContract4 = (TimeUtilsContract) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$2;
                str3 = (String) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$1;
                productReceiptData2 = (ProductReceiptData) cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$0;
                ResultKt.b(obj2);
                chaloTextStyleHelper2 = chaloTextStyleHelper5;
                list4 = list9;
                list5 = list10;
            }
            list4.add(new TicketInfoContentUIState.ValidatedAt(new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper3, TimeUtilsContract.DefaultImpls.a(timeUtilsContract4, productReceiptData2.getC(), str3, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9)));
            list = list5;
            if (list.size() > 1) {
                i = 4;
                dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, null, 4);
            } else {
                i = 4;
            }
            return new TicketInfoUIState(list, dividerUIState, i);
        }
        arrayListL = py.l(obj2);
        if (productReceiptData3 != null) {
            String i4 = productReceiptData3.getI();
            String g = productReceiptData3.getG();
            String h = productReceiptData3.getH();
            if (i4 != null && i4.length() != 0 && g != null && g.length() != 0 && h != null && h.length() != 0) {
                arrayListL.add(new TicketInfoContentUIState.RouteDetailInfo(new RouteDetailInfoUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper3, i4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper3, g, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper3, h, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), new SpecialFeaturesTagListUIState(EmptyList.f17557a))));
            }
        }
        if (!AnyExtsKt.a(productReceiptData3 != null ? productReceiptData3.getE() : null)) {
            str2 = str;
            timeUtilsContract2 = timeUtilsContract;
            list = arrayListL;
            if (productReceiptData3 != null) {
                list3 = arrayListL;
                l = new Long(productReceiptData3.getC());
            } else {
                list3 = arrayListL;
                l = null;
            }
            if (l != null && productReceiptData3.getC() > 0) {
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$0 = productReceiptData3;
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$1 = str2;
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$2 = timeUtilsContract2;
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$3 = list;
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$4 = list3;
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$5 = chaloTextStyleHelper3;
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$6 = null;
                cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.label = 2;
                objB = stringProvider3.b(StringEnum.TRIP_START_TIME, new Object[0], cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1);
                if (objB != coroutineSingletons) {
                    List list11 = list3;
                    obj2 = objB;
                    list4 = list11;
                    productReceiptData2 = productReceiptData3;
                    list5 = list;
                    str3 = str2;
                    timeUtilsContract4 = timeUtilsContract2;
                    chaloTextStyleHelper2 = chaloTextStyleHelper3;
                    list4.add(new TicketInfoContentUIState.ValidatedAt(new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper3, TimeUtilsContract.DefaultImpls.a(timeUtilsContract4, productReceiptData2.getC(), str3, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9)));
                    list = list5;
                }
            }
            if (list.size() > 1) {
                i = 4;
                dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, null, 4);
            } else {
                i = 4;
            }
            return new TicketInfoUIState(list, dividerUIState, i);
        }
        cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$0 = productReceiptData3;
        str2 = str;
        cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$1 = str2;
        cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$2 = timeUtilsContract;
        cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$3 = stringProvider3;
        cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$4 = arrayListL;
        cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$5 = arrayListL;
        cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$6 = chaloTextStyleHelper3;
        cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.label = 1;
        Object objB2 = stringProvider3.b(StringEnum.VEHICLE_NUMBER, new Object[0], cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1);
        if (objB2 != coroutineSingletons) {
            ArrayList arrayList = arrayListL;
            obj = objB2;
            chaloTextStyleHelper = chaloTextStyleHelper3;
            stringProvider2 = stringProvider3;
            list2 = arrayList;
            timeUtilsContract3 = timeUtilsContract;
            list6 = arrayList;
        }
        return coroutineSingletons;
        TextUIState.ChaloTextUIState chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
        if (productReceiptData3 == null || (e = productReceiptData3.getE()) == null) {
            e = "";
        }
        list2.add(new TicketInfoContentUIState.VehicleNumber(new TitleSubtitleUiState(null, chaloTextUIStateC, ChaloTextStyleHelper.c(chaloTextStyleHelper3, e, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9)));
        timeUtilsContract2 = timeUtilsContract3;
        stringProvider3 = stringProvider2;
        list3 = list2;
        list = list6;
        if (productReceiptData3 != null) {
            list3 = arrayListL;
            l = new Long(productReceiptData3.getC());
        } else {
            list3 = arrayListL;
            l = null;
        }
        if (l != null) {
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$0 = productReceiptData3;
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$1 = str2;
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$2 = timeUtilsContract2;
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$3 = list;
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$4 = list3;
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$5 = chaloTextStyleHelper3;
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.L$6 = null;
            cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1.label = 2;
            objB = stringProvider3.b(StringEnum.TRIP_START_TIME, new Object[0], cardSummaryUIStateMapperKt$createCardTransactionTicketInfoUIState$1);
            if (objB != coroutineSingletons) {
                List list12 = list3;
                obj2 = objB;
                list4 = list12;
                productReceiptData2 = productReceiptData3;
                list5 = list;
                str3 = str2;
                timeUtilsContract4 = timeUtilsContract2;
                chaloTextStyleHelper2 = chaloTextStyleHelper3;
                list4.add(new TicketInfoContentUIState.ValidatedAt(new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper2, (String) obj2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.g(chaloTextStyleHelper3, TimeUtilsContract.DefaultImpls.a(timeUtilsContract4, productReceiptData2.getC(), str3, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9)));
                list = list5;
            }
            return coroutineSingletons;
        }
        if (list.size() > 1) {
            i = 4;
            dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.Black_12.f9761a, null, 4);
        } else {
            i = 4;
        }
        return new TicketInfoUIState(list, dividerUIState, i);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0280  */
    /* JADX WARN: Code duplicated, block: B:36:0x02e6 A[PHI: r0 r1 r5 r6 r8 r9 r12 r13
      0x02e6: PHI (r0v11 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor) = 
      (r0v8 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor)
      (r0v14 app.chalo.uistate.base.ChaloColorToken$AlmostBlackColor)
     binds: [B:34:0x02e2, B:22:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r1v11 java.lang.Object) = (r1v8 java.lang.Object), (r1v16 java.lang.Object) binds: [B:34:0x02e2, B:22:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r5v11 app.chalo.utils.timeutil.TimeUtilsContract) = (r5v7 app.chalo.utils.timeutil.TimeUtilsContract), (r5v14 app.chalo.utils.timeutil.TimeUtilsContract) binds: [B:34:0x02e2, B:22:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r6v10 app.chalo.data.CardRechargeSummaryData) = (r6v6 app.chalo.data.CardRechargeSummaryData), (r6v14 app.chalo.data.CardRechargeSummaryData) binds: [B:34:0x02e2, B:22:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r8v2 app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState) = 
      (r8v1 app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState)
      (r8v4 app.chalo.productsummary.ui.data.ToolBarWithRightComponentUIState)
     binds: [B:34:0x02e2, B:22:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r9v7 app.chalo.features.wallet.CurrencyFeature) = (r9v4 app.chalo.features.wallet.CurrencyFeature), (r9v10 app.chalo.features.wallet.CurrencyFeature) binds: [B:34:0x02e2, B:22:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r12v10 java.lang.String) = (r12v6 java.lang.String), (r12v13 java.lang.String) binds: [B:34:0x02e2, B:22:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x02e6: PHI (r13v9 app.chalo.providers.stringprovider.StringProvider) = (r13v6 app.chalo.providers.stringprovider.StringProvider), (r13v10 app.chalo.providers.stringprovider.StringProvider) binds: [B:34:0x02e2, B:22:0x01b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0308  */
    /* JADX WARN: Code duplicated, block: B:43:0x0349  */
    /* JADX WARN: Code duplicated, block: B:47:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x041e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0491  */
    /* JADX WARN: Code duplicated, block: B:59:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:63:0x0527  */
    /* JADX WARN: Code duplicated, block: B:66:0x0569  */
    /* JADX WARN: Code duplicated, block: B:67:0x056f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0595  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object c(GetProductStatusUIForSummaryScreen getProductStatusUIForSummaryScreen, ChaloUserBookingType.CardBooking.CardRechargeBooking cardRechargeBooking, String str, StringProvider stringProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, ContinuationImpl continuationImpl) {
        CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
        ChaloUserBookingType.CardBooking.CardRechargeBooking cardRechargeBooking2;
        TimeUtilsContract timeUtilsContract2;
        CardRechargeSummaryData cardRechargeSummaryData;
        GetProductStatusUIForSummaryScreen getProductStatusUIForSummaryScreen2;
        CurrencyFeature currencyFeature2;
        String str2;
        BusTicketStatusUiState busTicketStatusUiState;
        Object objB;
        ChaloUserBookingType.CardBooking.CardRechargeBooking cardRechargeBooking3;
        String str3;
        GetProductStatusUIForSummaryScreen getProductStatusUIForSummaryScreen3;
        StringProvider stringProvider2;
        BusTicketStatusUiState busTicketStatusUiState2;
        CurrencyFeature currencyFeature3;
        TimeUtilsContract timeUtilsContract3;
        ChaloTextStyleHelper chaloTextStyleHelper;
        ChaloColorToken.AlmostBlackColor almostBlackColor;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState;
        Object objD;
        List list;
        Object objB2;
        CardRechargeSummaryData cardRechargeSummaryData2;
        String str4;
        CurrencyFeature currencyFeature4;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState2;
        TimeUtilsContract timeUtilsContract4;
        List list2;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        Object objB3;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        StringProvider stringProvider3;
        TimeUtilsContract timeUtilsContract5;
        CurrencyFeature currencyFeature5;
        StringProvider stringProvider4;
        TitleSubtitleUiState titleSubtitleUiState;
        CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2;
        Object objB4;
        TextUIState.ChaloTextUIState chaloTextUIState;
        StringProvider stringProvider5;
        List list3;
        TitleSubtitleUiState titleSubtitleUiState2;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3;
        TitleSubtitleUiState titleSubtitleUiState3;
        Object objB5;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        TitleSubtitleUiState titleSubtitleUiState4;
        BookingDetailsUIState bookingDetailsUIState;
        String strA;
        Object objB6;
        StringProvider stringProvider6;
        Object obj;
        String str5;
        BookingDetailsUIState bookingDetailsUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        List listR;
        Object objB7;
        CurrencyFeature currencyFeature6;
        StringProvider stringProvider7;
        CardRechargeSummaryData cardRechargeSummaryData3;
        List list4;
        ChaloTextStyleHelper chaloTextStyleHelper7;
        TextUIState.ChaloTextUIState chaloTextUIStateF2;
        Object objB8;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper8;
        CardRechargeSummaryData cardRechargeSummaryData4;
        CurrencyFeature currencyFeature7;
        StringProvider stringProvider8;
        DashedLineUIState dashedLineUIState;
        PriceDetailsUIState priceDetailsUIState;
        BookingDetailsUIState bookingDetailsUIState3;
        List list5;
        PriceDetailsUIState priceDetailsUIState2;
        StringProvider stringProvider9 = stringProvider;
        if (continuationImpl instanceof CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1) {
            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 = (CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1) continuationImpl;
            int i = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 = new CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1(continuationImpl);
            }
        } else {
            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 = new CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1(continuationImpl);
        }
        Object objA = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor2 = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloTextStyleHelper chaloTextStyleHelper9 = ChaloTextStyleHelper.f10078a;
        switch (i2) {
            case 0:
                ResultKt.b(objA);
                CardRechargeSummaryData cardRechargeSummaryData5 = cardRechargeBooking.d;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = getProductStatusUIForSummaryScreen;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = cardRechargeBooking;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = str;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = stringProvider9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = currencyFeature;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = timeUtilsContract;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = cardRechargeSummaryData5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 1;
                Object objE = e(cardRechargeSummaryData5, stringProvider9, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                if (objE != coroutineSingletons) {
                    cardRechargeBooking2 = cardRechargeBooking;
                    timeUtilsContract2 = timeUtilsContract;
                    cardRechargeSummaryData = cardRechargeSummaryData5;
                    objA = objE;
                    getProductStatusUIForSummaryScreen2 = getProductStatusUIForSummaryScreen;
                    currencyFeature2 = currencyFeature;
                    str2 = str;
                    busTicketStatusUiState = (BusTicketStatusUiState) objA;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = getProductStatusUIForSummaryScreen2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = cardRechargeBooking2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = str2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = stringProvider9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = currencyFeature2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = timeUtilsContract2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = cardRechargeSummaryData;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = busTicketStatusUiState;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 2;
                    objB = stringProvider9.b(StringEnum.CARD_RECHARGE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                    if (objB != coroutineSingletons) {
                        cardRechargeBooking3 = cardRechargeBooking2;
                        str3 = str2;
                        getProductStatusUIForSummaryScreen3 = getProductStatusUIForSummaryScreen2;
                        stringProvider2 = stringProvider9;
                        busTicketStatusUiState2 = busTicketStatusUiState;
                        objA = objB;
                        currencyFeature3 = currencyFeature2;
                        timeUtilsContract3 = timeUtilsContract2;
                        chaloTextStyleHelper = chaloTextStyleHelper9;
                        ChaloTextStyleHelper chaloTextStyleHelper10 = chaloTextStyleHelper;
                        almostBlackColor = almostBlackColor2;
                        toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper10, (String) objA, almostBlackColor2, null, null, null, 124), null, null, null, 0.0f, null, null, 253), busTicketStatusUiState2, 1);
                        we weVar = new we(2);
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 3;
                        objD = getProductStatusUIForSummaryScreen3.d(cardRechargeBooking3, null, weVar, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                        if (objD != coroutineSingletons) {
                            list = (List) objD;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextStyleHelper9;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 4;
                            objB2 = stringProvider2.b(StringEnum.BOOKING_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                            if (objB2 != coroutineSingletons) {
                                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState;
                                cardRechargeSummaryData2 = cardRechargeSummaryData;
                                str4 = str3;
                                currencyFeature4 = currencyFeature3;
                                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState4;
                                timeUtilsContract4 = timeUtilsContract3;
                                list2 = list;
                                chaloTextStyleHelper2 = chaloTextStyleHelper9;
                                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB2, almostBlackColor, null, null, 124);
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str4;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature4;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract4;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextUIStateF;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = chaloTextStyleHelper9;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 5;
                                objB3 = stringProvider2.b(StringEnum.BOOKING_DATE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                                if (objB3 != coroutineSingletons) {
                                    chaloTextStyleHelper3 = chaloTextStyleHelper9;
                                    stringProvider3 = stringProvider2;
                                    timeUtilsContract5 = timeUtilsContract4;
                                    TextUIState.ChaloTextUIState chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                    CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$4 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                                    currencyFeature5 = currencyFeature4;
                                    stringProvider4 = stringProvider3;
                                    titleSubtitleUiState = new TitleSubtitleUiState(null, chaloTextUIStateC, ChaloTextStyleHelper.c(chaloTextStyleHelper9, TimeUtilsContract.DefaultImpls.a(timeUtilsContract5, cardRechargeSummaryData2.e, str4, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$4;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$0 = stringProvider4;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$1 = currencyFeature5;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$2 = cardRechargeSummaryData2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$3 = toolBarWithRightComponentUIState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$4 = list2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$5 = chaloTextUIStateF;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$6 = titleSubtitleUiState;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$7 = chaloTextStyleHelper9;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$8 = null;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.label = 6;
                                    objB4 = stringProvider4.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2);
                                    if (objB4 != coroutineSingletons) {
                                        chaloTextUIState = chaloTextUIStateF;
                                        stringProvider5 = stringProvider4;
                                        list3 = list2;
                                        titleSubtitleUiState2 = titleSubtitleUiState;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper9;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2;
                                        titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.f2333a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = chaloTextUIState;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = titleSubtitleUiState2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = titleSubtitleUiState3;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 7;
                                        objB5 = stringProvider5.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                        if (objB5 != coroutineSingletons) {
                                            chaloTextStyleHelper5 = chaloTextStyleHelper9;
                                            titleSubtitleUiState4 = titleSubtitleUiState3;
                                            bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, titleSubtitleUiState2, titleSubtitleUiState4, null, new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9), null, null, 104);
                                            strA = currencyFeature5.a(cardRechargeSummaryData2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = strA;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = chaloTextStyleHelper9;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 8;
                                            objB6 = stringProvider5.b(StringEnum.TOP_UP_AMOUNT, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                            if (objB6 != coroutineSingletons) {
                                                stringProvider6 = stringProvider5;
                                                obj = objB6;
                                                str5 = strA;
                                                bookingDetailsUIState2 = bookingDetailsUIState;
                                                chaloTextStyleHelper6 = chaloTextStyleHelper9;
                                                listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                                                objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                                if (objB7 != coroutineSingletons) {
                                                    currencyFeature6 = currencyFeature5;
                                                    stringProvider7 = stringProvider6;
                                                    cardRechargeSummaryData3 = cardRechargeSummaryData2;
                                                    list4 = listR;
                                                    chaloTextStyleHelper7 = chaloTextStyleHelper9;
                                                    chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                                                    objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                                    if (objB8 != coroutineSingletons) {
                                                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                                        chaloTextStyleHelper8 = chaloTextStyleHelper9;
                                                        cardRechargeSummaryData4 = cardRechargeSummaryData3;
                                                        currencyFeature7 = currencyFeature6;
                                                        stringProvider8 = stringProvider7;
                                                        UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
                                                        StringProvider stringProvider10 = stringProvider8;
                                                        TitleSubtitleUiState titleSubtitleUiState5 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                                                        if (list4.isEmpty()) {
                                                            dashedLineUIState = null;
                                                        } else {
                                                            dashedLineUIState = new DashedLineUIState();
                                                        }
                                                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState5, list4, dashedLineUIState);
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                                                        objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider10, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                                        if (objA != coroutineSingletons) {
                                                            bookingDetailsUIState3 = bookingDetailsUIState2;
                                                            list5 = list3;
                                                            priceDetailsUIState2 = priceDetailsUIState;
                                                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                CardRechargeSummaryData cardRechargeSummaryData6 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                TimeUtilsContract timeUtilsContract6 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                currencyFeature2 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                StringProvider stringProvider11 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                str2 = (String) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                cardRechargeBooking2 = (ChaloUserBookingType.CardBooking.CardRechargeBooking) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                getProductStatusUIForSummaryScreen2 = (GetProductStatusUIForSummaryScreen) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                cardRechargeSummaryData = cardRechargeSummaryData6;
                timeUtilsContract2 = timeUtilsContract6;
                stringProvider9 = stringProvider11;
                busTicketStatusUiState = (BusTicketStatusUiState) objA;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = getProductStatusUIForSummaryScreen2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = cardRechargeBooking2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = str2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = stringProvider9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = currencyFeature2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = timeUtilsContract2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = cardRechargeSummaryData;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = busTicketStatusUiState;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = chaloTextStyleHelper9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 2;
                objB = stringProvider9.b(StringEnum.CARD_RECHARGE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                if (objB != coroutineSingletons) {
                    cardRechargeBooking3 = cardRechargeBooking2;
                    str3 = str2;
                    getProductStatusUIForSummaryScreen3 = getProductStatusUIForSummaryScreen2;
                    stringProvider2 = stringProvider9;
                    busTicketStatusUiState2 = busTicketStatusUiState;
                    objA = objB;
                    currencyFeature3 = currencyFeature2;
                    timeUtilsContract3 = timeUtilsContract2;
                    chaloTextStyleHelper = chaloTextStyleHelper9;
                    ChaloTextStyleHelper chaloTextStyleHelper11 = chaloTextStyleHelper;
                    almostBlackColor = almostBlackColor2;
                    toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper11, (String) objA, almostBlackColor2, null, null, null, 124), null, null, null, 0.0f, null, null, 253), busTicketStatusUiState2, 1);
                    we weVar2 = new we(2);
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 3;
                    objD = getProductStatusUIForSummaryScreen3.d(cardRechargeBooking3, null, weVar2, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                    if (objD != coroutineSingletons) {
                        list = (List) objD;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextStyleHelper9;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 4;
                        objB2 = stringProvider2.b(StringEnum.BOOKING_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                        if (objB2 != coroutineSingletons) {
                            ToolBarWithRightComponentUIState toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState;
                            cardRechargeSummaryData2 = cardRechargeSummaryData;
                            str4 = str3;
                            currencyFeature4 = currencyFeature3;
                            toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState5;
                            timeUtilsContract4 = timeUtilsContract3;
                            list2 = list;
                            chaloTextStyleHelper2 = chaloTextStyleHelper9;
                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB2, almostBlackColor, null, null, 124);
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str4;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature4;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract4;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextUIStateF;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = chaloTextStyleHelper9;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 5;
                            objB3 = stringProvider2.b(StringEnum.BOOKING_DATE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                            if (objB3 != coroutineSingletons) {
                                chaloTextStyleHelper3 = chaloTextStyleHelper9;
                                stringProvider3 = stringProvider2;
                                timeUtilsContract5 = timeUtilsContract4;
                                TextUIState.ChaloTextUIState chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$5 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                                currencyFeature5 = currencyFeature4;
                                stringProvider4 = stringProvider3;
                                titleSubtitleUiState = new TitleSubtitleUiState(null, chaloTextUIStateC2, ChaloTextStyleHelper.c(chaloTextStyleHelper9, TimeUtilsContract.DefaultImpls.a(timeUtilsContract5, cardRechargeSummaryData2.e, str4, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$0 = stringProvider4;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$1 = currencyFeature5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$2 = cardRechargeSummaryData2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$3 = toolBarWithRightComponentUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$4 = list2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$5 = chaloTextUIStateF;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$6 = titleSubtitleUiState;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$7 = chaloTextStyleHelper9;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$8 = null;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.label = 6;
                                objB4 = stringProvider4.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2);
                                if (objB4 != coroutineSingletons) {
                                    chaloTextUIState = chaloTextUIStateF;
                                    stringProvider5 = stringProvider4;
                                    list3 = list2;
                                    titleSubtitleUiState2 = titleSubtitleUiState;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper9;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2;
                                    titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.f2333a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = chaloTextUIState;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = titleSubtitleUiState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = titleSubtitleUiState3;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 7;
                                    objB5 = stringProvider5.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                    if (objB5 != coroutineSingletons) {
                                        chaloTextStyleHelper5 = chaloTextStyleHelper9;
                                        titleSubtitleUiState4 = titleSubtitleUiState3;
                                        bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, titleSubtitleUiState2, titleSubtitleUiState4, null, new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9), null, null, 104);
                                        strA = currencyFeature5.a(cardRechargeSummaryData2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = strA;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = chaloTextStyleHelper9;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 8;
                                        objB6 = stringProvider5.b(StringEnum.TOP_UP_AMOUNT, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                        if (objB6 != coroutineSingletons) {
                                            stringProvider6 = stringProvider5;
                                            obj = objB6;
                                            str5 = strA;
                                            bookingDetailsUIState2 = bookingDetailsUIState;
                                            chaloTextStyleHelper6 = chaloTextStyleHelper9;
                                            listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                                            objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                            if (objB7 != coroutineSingletons) {
                                                currencyFeature6 = currencyFeature5;
                                                stringProvider7 = stringProvider6;
                                                cardRechargeSummaryData3 = cardRechargeSummaryData2;
                                                list4 = listR;
                                                chaloTextStyleHelper7 = chaloTextStyleHelper9;
                                                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                                                objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                                if (objB8 != coroutineSingletons) {
                                                    toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                                    chaloTextStyleHelper8 = chaloTextStyleHelper9;
                                                    cardRechargeSummaryData4 = cardRechargeSummaryData3;
                                                    currencyFeature7 = currencyFeature6;
                                                    stringProvider8 = stringProvider7;
                                                    UIFontWeight uIFontWeight2 = UIFontWeight.SemiBold;
                                                    StringProvider stringProvider12 = stringProvider8;
                                                    TitleSubtitleUiState titleSubtitleUiState6 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight2, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight2, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                                                    if (list4.isEmpty()) {
                                                        dashedLineUIState = new DashedLineUIState();
                                                    } else {
                                                        dashedLineUIState = null;
                                                    }
                                                    priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState6, list4, dashedLineUIState);
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                                                    objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider12, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                                    if (objA != coroutineSingletons) {
                                                        bookingDetailsUIState3 = bookingDetailsUIState2;
                                                        list5 = list3;
                                                        priceDetailsUIState2 = priceDetailsUIState;
                                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                chaloTextStyleHelper = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8;
                busTicketStatusUiState2 = (BusTicketStatusUiState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7;
                CardRechargeSummaryData cardRechargeSummaryData7 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                TimeUtilsContract timeUtilsContract7 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                CurrencyFeature currencyFeature8 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                stringProvider2 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                String str6 = (String) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                cardRechargeBooking3 = (ChaloUserBookingType.CardBooking.CardRechargeBooking) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                getProductStatusUIForSummaryScreen3 = (GetProductStatusUIForSummaryScreen) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                cardRechargeSummaryData = cardRechargeSummaryData7;
                timeUtilsContract3 = timeUtilsContract7;
                currencyFeature3 = currencyFeature8;
                str3 = str6;
                ChaloTextStyleHelper chaloTextStyleHelper12 = chaloTextStyleHelper;
                almostBlackColor = almostBlackColor2;
                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper12, (String) objA, almostBlackColor2, null, null, null, 124), null, null, null, 0.0f, null, null, 253), busTicketStatusUiState2, 1);
                we weVar3 = new we(2);
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 3;
                objD = getProductStatusUIForSummaryScreen3.d(cardRechargeBooking3, null, weVar3, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                if (objD != coroutineSingletons) {
                    list = (List) objD;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 4;
                    objB2 = stringProvider2.b(StringEnum.BOOKING_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                    if (objB2 != coroutineSingletons) {
                        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState;
                        cardRechargeSummaryData2 = cardRechargeSummaryData;
                        str4 = str3;
                        currencyFeature4 = currencyFeature3;
                        toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState6;
                        timeUtilsContract4 = timeUtilsContract3;
                        list2 = list;
                        chaloTextStyleHelper2 = chaloTextStyleHelper9;
                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB2, almostBlackColor, null, null, 124);
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str4;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature4;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract4;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextUIStateF;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = chaloTextStyleHelper9;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 5;
                        objB3 = stringProvider2.b(StringEnum.BOOKING_DATE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                        if (objB3 != coroutineSingletons) {
                            chaloTextStyleHelper3 = chaloTextStyleHelper9;
                            stringProvider3 = stringProvider2;
                            timeUtilsContract5 = timeUtilsContract4;
                            TextUIState.ChaloTextUIState chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                            CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$6 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                            currencyFeature5 = currencyFeature4;
                            stringProvider4 = stringProvider3;
                            titleSubtitleUiState = new TitleSubtitleUiState(null, chaloTextUIStateC3, ChaloTextStyleHelper.c(chaloTextStyleHelper9, TimeUtilsContract.DefaultImpls.a(timeUtilsContract5, cardRechargeSummaryData2.e, str4, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$6;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$0 = stringProvider4;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$1 = currencyFeature5;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$2 = cardRechargeSummaryData2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$3 = toolBarWithRightComponentUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$4 = list2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$5 = chaloTextUIStateF;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$6 = titleSubtitleUiState;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$7 = chaloTextStyleHelper9;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$8 = null;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.label = 6;
                            objB4 = stringProvider4.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2);
                            if (objB4 != coroutineSingletons) {
                                chaloTextUIState = chaloTextUIStateF;
                                stringProvider5 = stringProvider4;
                                list3 = list2;
                                titleSubtitleUiState2 = titleSubtitleUiState;
                                chaloTextStyleHelper4 = chaloTextStyleHelper9;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2;
                                titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.f2333a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = chaloTextUIState;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = titleSubtitleUiState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = titleSubtitleUiState3;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 7;
                                objB5 = stringProvider5.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                if (objB5 != coroutineSingletons) {
                                    chaloTextStyleHelper5 = chaloTextStyleHelper9;
                                    titleSubtitleUiState4 = titleSubtitleUiState3;
                                    bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, titleSubtitleUiState2, titleSubtitleUiState4, null, new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9), null, null, 104);
                                    strA = currencyFeature5.a(cardRechargeSummaryData2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = strA;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = chaloTextStyleHelper9;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 8;
                                    objB6 = stringProvider5.b(StringEnum.TOP_UP_AMOUNT, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                    if (objB6 != coroutineSingletons) {
                                        stringProvider6 = stringProvider5;
                                        obj = objB6;
                                        str5 = strA;
                                        bookingDetailsUIState2 = bookingDetailsUIState;
                                        chaloTextStyleHelper6 = chaloTextStyleHelper9;
                                        listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                                        objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                        if (objB7 != coroutineSingletons) {
                                            currencyFeature6 = currencyFeature5;
                                            stringProvider7 = stringProvider6;
                                            cardRechargeSummaryData3 = cardRechargeSummaryData2;
                                            list4 = listR;
                                            chaloTextStyleHelper7 = chaloTextStyleHelper9;
                                            chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                                            objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                            if (objB8 != coroutineSingletons) {
                                                toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                                chaloTextStyleHelper8 = chaloTextStyleHelper9;
                                                cardRechargeSummaryData4 = cardRechargeSummaryData3;
                                                currencyFeature7 = currencyFeature6;
                                                stringProvider8 = stringProvider7;
                                                UIFontWeight uIFontWeight3 = UIFontWeight.SemiBold;
                                                StringProvider stringProvider13 = stringProvider8;
                                                TitleSubtitleUiState titleSubtitleUiState7 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight3, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight3, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                                                if (list4.isEmpty()) {
                                                    dashedLineUIState = new DashedLineUIState();
                                                } else {
                                                    dashedLineUIState = null;
                                                }
                                                priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState7, list4, dashedLineUIState);
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                                                objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider13, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                                if (objA != coroutineSingletons) {
                                                    bookingDetailsUIState3 = bookingDetailsUIState2;
                                                    list5 = list3;
                                                    priceDetailsUIState2 = priceDetailsUIState;
                                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState7 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                CardRechargeSummaryData cardRechargeSummaryData8 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                timeUtilsContract3 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                CurrencyFeature currencyFeature9 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                StringProvider stringProvider14 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                str3 = (String) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                toolBarWithRightComponentUIState = toolBarWithRightComponentUIState7;
                almostBlackColor = almostBlackColor2;
                currencyFeature3 = currencyFeature9;
                stringProvider2 = stringProvider14;
                cardRechargeSummaryData = cardRechargeSummaryData8;
                objD = objA;
                list = (List) objD;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextStyleHelper9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 4;
                objB2 = stringProvider2.b(StringEnum.BOOKING_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                if (objB2 != coroutineSingletons) {
                    ToolBarWithRightComponentUIState toolBarWithRightComponentUIState8 = toolBarWithRightComponentUIState;
                    cardRechargeSummaryData2 = cardRechargeSummaryData;
                    str4 = str3;
                    currencyFeature4 = currencyFeature3;
                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState8;
                    timeUtilsContract4 = timeUtilsContract3;
                    list2 = list;
                    chaloTextStyleHelper2 = chaloTextStyleHelper9;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB2, almostBlackColor, null, null, 124);
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str4;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature4;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract4;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextUIStateF;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 5;
                    objB3 = stringProvider2.b(StringEnum.BOOKING_DATE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                    if (objB3 != coroutineSingletons) {
                        chaloTextStyleHelper3 = chaloTextStyleHelper9;
                        stringProvider3 = stringProvider2;
                        timeUtilsContract5 = timeUtilsContract4;
                        TextUIState.ChaloTextUIState chaloTextUIStateC4 = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$7 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                        currencyFeature5 = currencyFeature4;
                        stringProvider4 = stringProvider3;
                        titleSubtitleUiState = new TitleSubtitleUiState(null, chaloTextUIStateC4, ChaloTextStyleHelper.c(chaloTextStyleHelper9, TimeUtilsContract.DefaultImpls.a(timeUtilsContract5, cardRechargeSummaryData2.e, str4, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$7;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$0 = stringProvider4;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$1 = currencyFeature5;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$2 = cardRechargeSummaryData2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$3 = toolBarWithRightComponentUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$4 = list2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$5 = chaloTextUIStateF;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$6 = titleSubtitleUiState;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$7 = chaloTextStyleHelper9;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$8 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.label = 6;
                        objB4 = stringProvider4.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2);
                        if (objB4 != coroutineSingletons) {
                            chaloTextUIState = chaloTextUIStateF;
                            stringProvider5 = stringProvider4;
                            list3 = list2;
                            titleSubtitleUiState2 = titleSubtitleUiState;
                            chaloTextStyleHelper4 = chaloTextStyleHelper9;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2;
                            titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.f2333a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = chaloTextUIState;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = titleSubtitleUiState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = titleSubtitleUiState3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 7;
                            objB5 = stringProvider5.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                            if (objB5 != coroutineSingletons) {
                                chaloTextStyleHelper5 = chaloTextStyleHelper9;
                                titleSubtitleUiState4 = titleSubtitleUiState3;
                                bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, titleSubtitleUiState2, titleSubtitleUiState4, null, new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9), null, null, 104);
                                strA = currencyFeature5.a(cardRechargeSummaryData2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = strA;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = chaloTextStyleHelper9;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 8;
                                objB6 = stringProvider5.b(StringEnum.TOP_UP_AMOUNT, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                if (objB6 != coroutineSingletons) {
                                    stringProvider6 = stringProvider5;
                                    obj = objB6;
                                    str5 = strA;
                                    bookingDetailsUIState2 = bookingDetailsUIState;
                                    chaloTextStyleHelper6 = chaloTextStyleHelper9;
                                    listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                                    objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                    if (objB7 != coroutineSingletons) {
                                        currencyFeature6 = currencyFeature5;
                                        stringProvider7 = stringProvider6;
                                        cardRechargeSummaryData3 = cardRechargeSummaryData2;
                                        list4 = listR;
                                        chaloTextStyleHelper7 = chaloTextStyleHelper9;
                                        chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                                        objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                        if (objB8 != coroutineSingletons) {
                                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                            chaloTextStyleHelper8 = chaloTextStyleHelper9;
                                            cardRechargeSummaryData4 = cardRechargeSummaryData3;
                                            currencyFeature7 = currencyFeature6;
                                            stringProvider8 = stringProvider7;
                                            UIFontWeight uIFontWeight4 = UIFontWeight.SemiBold;
                                            StringProvider stringProvider15 = stringProvider8;
                                            TitleSubtitleUiState titleSubtitleUiState8 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight4, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight4, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                                            if (list4.isEmpty()) {
                                                dashedLineUIState = new DashedLineUIState();
                                            } else {
                                                dashedLineUIState = null;
                                            }
                                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState8, list4, dashedLineUIState);
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                                            objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider15, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                            if (objA != coroutineSingletons) {
                                                bookingDetailsUIState3 = bookingDetailsUIState2;
                                                list5 = list3;
                                                priceDetailsUIState2 = priceDetailsUIState;
                                                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                ChaloTextStyleHelper chaloTextStyleHelper13 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7;
                List list6 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState9 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                CardRechargeSummaryData cardRechargeSummaryData9 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                TimeUtilsContract timeUtilsContract8 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                currencyFeature4 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                stringProvider2 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                String str7 = (String) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState9;
                timeUtilsContract4 = timeUtilsContract8;
                list2 = list6;
                objB2 = objA;
                chaloTextStyleHelper2 = chaloTextStyleHelper13;
                almostBlackColor = almostBlackColor2;
                cardRechargeSummaryData2 = cardRechargeSummaryData9;
                str4 = str7;
                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB2, almostBlackColor, null, null, 124);
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0 = str4;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1 = stringProvider2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2 = currencyFeature4;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3 = timeUtilsContract4;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4 = cardRechargeSummaryData2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5 = toolBarWithRightComponentUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6 = list2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7 = chaloTextUIStateF;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8 = chaloTextStyleHelper9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.label = 5;
                objB3 = stringProvider2.b(StringEnum.BOOKING_DATE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1);
                if (objB3 != coroutineSingletons) {
                    chaloTextStyleHelper3 = chaloTextStyleHelper9;
                    stringProvider3 = stringProvider2;
                    timeUtilsContract5 = timeUtilsContract4;
                    TextUIState.ChaloTextUIState chaloTextUIStateC5 = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$8 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                    currencyFeature5 = currencyFeature4;
                    stringProvider4 = stringProvider3;
                    titleSubtitleUiState = new TitleSubtitleUiState(null, chaloTextUIStateC5, ChaloTextStyleHelper.c(chaloTextStyleHelper9, TimeUtilsContract.DefaultImpls.a(timeUtilsContract5, cardRechargeSummaryData2.e, str4, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$8;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$0 = stringProvider4;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$1 = currencyFeature5;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$2 = cardRechargeSummaryData2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$3 = toolBarWithRightComponentUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$4 = list2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$5 = chaloTextUIStateF;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$6 = titleSubtitleUiState;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$7 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$8 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.label = 6;
                    objB4 = stringProvider4.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2);
                    if (objB4 != coroutineSingletons) {
                        chaloTextUIState = chaloTextUIStateF;
                        stringProvider5 = stringProvider4;
                        list3 = list2;
                        titleSubtitleUiState2 = titleSubtitleUiState;
                        chaloTextStyleHelper4 = chaloTextStyleHelper9;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2;
                        titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.f2333a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = chaloTextUIState;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = titleSubtitleUiState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = titleSubtitleUiState3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 7;
                        objB5 = stringProvider5.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                        if (objB5 != coroutineSingletons) {
                            chaloTextStyleHelper5 = chaloTextStyleHelper9;
                            titleSubtitleUiState4 = titleSubtitleUiState3;
                            bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, titleSubtitleUiState2, titleSubtitleUiState4, null, new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9), null, null, 104);
                            strA = currencyFeature5.a(cardRechargeSummaryData2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = strA;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = chaloTextStyleHelper9;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 8;
                            objB6 = stringProvider5.b(StringEnum.TOP_UP_AMOUNT, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                            if (objB6 != coroutineSingletons) {
                                stringProvider6 = stringProvider5;
                                obj = objB6;
                                str5 = strA;
                                bookingDetailsUIState2 = bookingDetailsUIState;
                                chaloTextStyleHelper6 = chaloTextStyleHelper9;
                                listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                                objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                if (objB7 != coroutineSingletons) {
                                    currencyFeature6 = currencyFeature5;
                                    stringProvider7 = stringProvider6;
                                    cardRechargeSummaryData3 = cardRechargeSummaryData2;
                                    list4 = listR;
                                    chaloTextStyleHelper7 = chaloTextStyleHelper9;
                                    chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                                    objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                    if (objB8 != coroutineSingletons) {
                                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                        chaloTextStyleHelper8 = chaloTextStyleHelper9;
                                        cardRechargeSummaryData4 = cardRechargeSummaryData3;
                                        currencyFeature7 = currencyFeature6;
                                        stringProvider8 = stringProvider7;
                                        UIFontWeight uIFontWeight5 = UIFontWeight.SemiBold;
                                        StringProvider stringProvider16 = stringProvider8;
                                        TitleSubtitleUiState titleSubtitleUiState9 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight5, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight5, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                                        if (list4.isEmpty()) {
                                            dashedLineUIState = new DashedLineUIState();
                                        } else {
                                            dashedLineUIState = null;
                                        }
                                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState9, list4, dashedLineUIState);
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                                        objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider16, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                        if (objA != coroutineSingletons) {
                                            bookingDetailsUIState3 = bookingDetailsUIState2;
                                            list5 = list3;
                                            priceDetailsUIState2 = priceDetailsUIState;
                                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                ChaloTextStyleHelper chaloTextStyleHelper14 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8;
                chaloTextUIStateF = (TextUIState.ChaloTextUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7;
                list2 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState10 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                CardRechargeSummaryData cardRechargeSummaryData10 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                timeUtilsContract5 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                CurrencyFeature currencyFeature10 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                StringProvider stringProvider17 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                str4 = (String) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                chaloTextStyleHelper3 = chaloTextStyleHelper14;
                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState10;
                almostBlackColor = almostBlackColor2;
                cardRechargeSummaryData2 = cardRechargeSummaryData10;
                currencyFeature4 = currencyFeature10;
                stringProvider3 = stringProvider17;
                objB3 = objA;
                TextUIState.ChaloTextUIState chaloTextUIStateC6 = ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                CardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1 cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$9 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                currencyFeature5 = currencyFeature4;
                stringProvider4 = stringProvider3;
                titleSubtitleUiState = new TitleSubtitleUiState(null, chaloTextUIStateC6, ChaloTextStyleHelper.c(chaloTextStyleHelper9, TimeUtilsContract.DefaultImpls.a(timeUtilsContract5, cardRechargeSummaryData2.e, str4, 4), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$0 = stringProvider4;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$1 = currencyFeature5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$2 = cardRechargeSummaryData2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$3 = toolBarWithRightComponentUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$4 = list2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$5 = chaloTextUIStateF;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$6 = titleSubtitleUiState;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$7 = chaloTextStyleHelper9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.L$8 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2.label = 6;
                objB4 = stringProvider4.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2);
                if (objB4 != coroutineSingletons) {
                    chaloTextUIState = chaloTextUIStateF;
                    stringProvider5 = stringProvider4;
                    list3 = list2;
                    titleSubtitleUiState2 = titleSubtitleUiState;
                    chaloTextStyleHelper4 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2;
                    titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.f2333a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = chaloTextUIState;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = titleSubtitleUiState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = titleSubtitleUiState3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 7;
                    objB5 = stringProvider5.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                    if (objB5 != coroutineSingletons) {
                        chaloTextStyleHelper5 = chaloTextStyleHelper9;
                        titleSubtitleUiState4 = titleSubtitleUiState3;
                        bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, titleSubtitleUiState2, titleSubtitleUiState4, null, new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9), null, null, 104);
                        strA = currencyFeature5.a(cardRechargeSummaryData2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = strA;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = chaloTextStyleHelper9;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 8;
                        objB6 = stringProvider5.b(StringEnum.TOP_UP_AMOUNT, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                        if (objB6 != coroutineSingletons) {
                            stringProvider6 = stringProvider5;
                            obj = objB6;
                            str5 = strA;
                            bookingDetailsUIState2 = bookingDetailsUIState;
                            chaloTextStyleHelper6 = chaloTextStyleHelper9;
                            listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                            objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                            if (objB7 != coroutineSingletons) {
                                currencyFeature6 = currencyFeature5;
                                stringProvider7 = stringProvider6;
                                cardRechargeSummaryData3 = cardRechargeSummaryData2;
                                list4 = listR;
                                chaloTextStyleHelper7 = chaloTextStyleHelper9;
                                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                                objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                if (objB8 != coroutineSingletons) {
                                    toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                    chaloTextStyleHelper8 = chaloTextStyleHelper9;
                                    cardRechargeSummaryData4 = cardRechargeSummaryData3;
                                    currencyFeature7 = currencyFeature6;
                                    stringProvider8 = stringProvider7;
                                    UIFontWeight uIFontWeight6 = UIFontWeight.SemiBold;
                                    StringProvider stringProvider18 = stringProvider8;
                                    TitleSubtitleUiState titleSubtitleUiState10 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight6, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight6, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                                    if (list4.isEmpty()) {
                                        dashedLineUIState = new DashedLineUIState();
                                    } else {
                                        dashedLineUIState = null;
                                    }
                                    priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState10, list4, dashedLineUIState);
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                                    objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider18, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                    if (objA != coroutineSingletons) {
                                        bookingDetailsUIState3 = bookingDetailsUIState2;
                                        list5 = list3;
                                        priceDetailsUIState2 = priceDetailsUIState;
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                ChaloTextStyleHelper chaloTextStyleHelper15 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7;
                TitleSubtitleUiState titleSubtitleUiState11 = (TitleSubtitleUiState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                List list7 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState11 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                CardRechargeSummaryData cardRechargeSummaryData11 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                CurrencyFeature currencyFeature11 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                StringProvider stringProvider19 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                currencyFeature5 = currencyFeature11;
                chaloTextStyleHelper4 = chaloTextStyleHelper15;
                objB4 = objA;
                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState11;
                almostBlackColor = almostBlackColor2;
                cardRechargeSummaryData2 = cardRechargeSummaryData11;
                list3 = list7;
                chaloTextUIState = chaloTextUIState2;
                titleSubtitleUiState2 = titleSubtitleUiState11;
                stringProvider5 = stringProvider19;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$2;
                titleSubtitleUiState3 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB4, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.f2333a, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = chaloTextUIState;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = titleSubtitleUiState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = titleSubtitleUiState3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 7;
                objB5 = stringProvider5.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                if (objB5 != coroutineSingletons) {
                    chaloTextStyleHelper5 = chaloTextStyleHelper9;
                    titleSubtitleUiState4 = titleSubtitleUiState3;
                    bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, titleSubtitleUiState2, titleSubtitleUiState4, null, new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9), null, null, 104);
                    strA = currencyFeature5.a(cardRechargeSummaryData2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = strA;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 8;
                    objB6 = stringProvider5.b(StringEnum.TOP_UP_AMOUNT, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                    if (objB6 != coroutineSingletons) {
                        stringProvider6 = stringProvider5;
                        obj = objB6;
                        str5 = strA;
                        bookingDetailsUIState2 = bookingDetailsUIState;
                        chaloTextStyleHelper6 = chaloTextStyleHelper9;
                        listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                        objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                        if (objB7 != coroutineSingletons) {
                            currencyFeature6 = currencyFeature5;
                            stringProvider7 = stringProvider6;
                            cardRechargeSummaryData3 = cardRechargeSummaryData2;
                            list4 = listR;
                            chaloTextStyleHelper7 = chaloTextStyleHelper9;
                            chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                            objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                            if (objB8 != coroutineSingletons) {
                                toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                                chaloTextStyleHelper8 = chaloTextStyleHelper9;
                                cardRechargeSummaryData4 = cardRechargeSummaryData3;
                                currencyFeature7 = currencyFeature6;
                                stringProvider8 = stringProvider7;
                                UIFontWeight uIFontWeight7 = UIFontWeight.SemiBold;
                                StringProvider stringProvider110 = stringProvider8;
                                TitleSubtitleUiState titleSubtitleUiState12 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight7, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight7, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                                if (list4.isEmpty()) {
                                    dashedLineUIState = new DashedLineUIState();
                                } else {
                                    dashedLineUIState = null;
                                }
                                priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState12, list4, dashedLineUIState);
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                                objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider110, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                                if (objA != coroutineSingletons) {
                                    bookingDetailsUIState3 = bookingDetailsUIState2;
                                    list5 = list3;
                                    priceDetailsUIState2 = priceDetailsUIState;
                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                ChaloTextStyleHelper chaloTextStyleHelper16 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8;
                TitleSubtitleUiState titleSubtitleUiState13 = (TitleSubtitleUiState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7;
                titleSubtitleUiState2 = (TitleSubtitleUiState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                chaloTextUIState = (TextUIState.ChaloTextUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                list3 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState12 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                CardRechargeSummaryData cardRechargeSummaryData12 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                CurrencyFeature currencyFeature12 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                StringProvider stringProvider20 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                chaloTextStyleHelper5 = chaloTextStyleHelper16;
                titleSubtitleUiState4 = titleSubtitleUiState13;
                almostBlackColor = almostBlackColor2;
                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState12;
                cardRechargeSummaryData2 = cardRechargeSummaryData12;
                stringProvider5 = stringProvider20;
                objB5 = objA;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                currencyFeature5 = currencyFeature12;
                bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, titleSubtitleUiState2, titleSubtitleUiState4, null, new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper5, (String) objB5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, cardRechargeSummaryData2.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9), null, null, 104);
                strA = currencyFeature5.a(cardRechargeSummaryData2.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = strA;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = chaloTextStyleHelper9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 8;
                objB6 = stringProvider5.b(StringEnum.TOP_UP_AMOUNT, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                if (objB6 != coroutineSingletons) {
                    stringProvider6 = stringProvider5;
                    obj = objB6;
                    str5 = strA;
                    bookingDetailsUIState2 = bookingDetailsUIState;
                    chaloTextStyleHelper6 = chaloTextStyleHelper9;
                    listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                    objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                    if (objB7 != coroutineSingletons) {
                        currencyFeature6 = currencyFeature5;
                        stringProvider7 = stringProvider6;
                        cardRechargeSummaryData3 = cardRechargeSummaryData2;
                        list4 = listR;
                        chaloTextStyleHelper7 = chaloTextStyleHelper9;
                        chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                        objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                        if (objB8 != coroutineSingletons) {
                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                            chaloTextStyleHelper8 = chaloTextStyleHelper9;
                            cardRechargeSummaryData4 = cardRechargeSummaryData3;
                            currencyFeature7 = currencyFeature6;
                            stringProvider8 = stringProvider7;
                            UIFontWeight uIFontWeight8 = UIFontWeight.SemiBold;
                            StringProvider stringProvider111 = stringProvider8;
                            TitleSubtitleUiState titleSubtitleUiState14 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight8, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight8, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                            if (list4.isEmpty()) {
                                dashedLineUIState = new DashedLineUIState();
                            } else {
                                dashedLineUIState = null;
                            }
                            priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState14, list4, dashedLineUIState);
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                            cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                            objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider111, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                            if (objA != coroutineSingletons) {
                                bookingDetailsUIState3 = bookingDetailsUIState2;
                                list5 = list3;
                                priceDetailsUIState2 = priceDetailsUIState;
                                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 8:
                ChaloTextStyleHelper chaloTextStyleHelper17 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7;
                String str8 = (String) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                BookingDetailsUIState bookingDetailsUIState4 = (BookingDetailsUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                List list8 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState13 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                CardRechargeSummaryData cardRechargeSummaryData13 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                CurrencyFeature currencyFeature13 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                StringProvider stringProvider21 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                chaloTextStyleHelper6 = chaloTextStyleHelper17;
                str5 = str8;
                obj = objA;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState13;
                almostBlackColor = almostBlackColor2;
                cardRechargeSummaryData2 = cardRechargeSummaryData13;
                currencyFeature5 = currencyFeature13;
                list3 = list8;
                bookingDetailsUIState2 = bookingDetailsUIState4;
                stringProvider6 = stringProvider21;
                listR = CollectionsKt.R(new FareBreakupUIState(ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) obj, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT)));
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider6;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = listR;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextStyleHelper9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 9;
                objB7 = stringProvider6.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                if (objB7 != coroutineSingletons) {
                    currencyFeature6 = currencyFeature5;
                    stringProvider7 = stringProvider6;
                    cardRechargeSummaryData3 = cardRechargeSummaryData2;
                    list4 = listR;
                    chaloTextStyleHelper7 = chaloTextStyleHelper9;
                    chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                    objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                    if (objB8 != coroutineSingletons) {
                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                        chaloTextStyleHelper8 = chaloTextStyleHelper9;
                        cardRechargeSummaryData4 = cardRechargeSummaryData3;
                        currencyFeature7 = currencyFeature6;
                        stringProvider8 = stringProvider7;
                        UIFontWeight uIFontWeight9 = UIFontWeight.SemiBold;
                        StringProvider stringProvider112 = stringProvider8;
                        TitleSubtitleUiState titleSubtitleUiState15 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight9, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight9, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                        if (list4.isEmpty()) {
                            dashedLineUIState = new DashedLineUIState();
                        } else {
                            dashedLineUIState = null;
                        }
                        priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState15, list4, dashedLineUIState);
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                        cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                        objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider112, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                        if (objA != coroutineSingletons) {
                            bookingDetailsUIState3 = bookingDetailsUIState2;
                            list5 = list3;
                            priceDetailsUIState2 = priceDetailsUIState;
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                        }
                    }
                }
                return coroutineSingletons;
            case 9:
                ChaloTextStyleHelper chaloTextStyleHelper18 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8;
                List list9 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7;
                String str9 = (String) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                bookingDetailsUIState2 = (BookingDetailsUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                list3 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState14 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                cardRechargeSummaryData3 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                currencyFeature6 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                stringProvider7 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                str5 = str9;
                toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState14;
                list4 = list9;
                objB7 = objA;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                chaloTextStyleHelper7 = chaloTextStyleHelper18;
                almostBlackColor = almostBlackColor2;
                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper7, (String) objB7, almostBlackColor, null, null, 124);
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = stringProvider7;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = currencyFeature6;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = cardRechargeSummaryData3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = toolBarWithRightComponentUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = list3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = bookingDetailsUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = str5;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = list4;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = chaloTextUIStateF2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = chaloTextStyleHelper9;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 10;
                objB8 = stringProvider7.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                if (objB8 != coroutineSingletons) {
                    toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                    chaloTextStyleHelper8 = chaloTextStyleHelper9;
                    cardRechargeSummaryData4 = cardRechargeSummaryData3;
                    currencyFeature7 = currencyFeature6;
                    stringProvider8 = stringProvider7;
                    UIFontWeight uIFontWeight10 = UIFontWeight.SemiBold;
                    StringProvider stringProvider113 = stringProvider8;
                    TitleSubtitleUiState titleSubtitleUiState16 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight10, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight10, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                    if (list4.isEmpty()) {
                        dashedLineUIState = new DashedLineUIState();
                    } else {
                        dashedLineUIState = null;
                    }
                    priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState16, list4, dashedLineUIState);
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                    cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                    objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider113, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                    if (objA != coroutineSingletons) {
                        bookingDetailsUIState3 = bookingDetailsUIState2;
                        list5 = list3;
                        priceDetailsUIState2 = priceDetailsUIState;
                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                    }
                }
                return coroutineSingletons;
            case 10:
                ChaloTextStyleHelper chaloTextStyleHelper19 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$9;
                chaloTextUIStateF2 = (TextUIState.ChaloTextUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$8;
                list4 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$7;
                String str10 = (String) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$6;
                BookingDetailsUIState bookingDetailsUIState5 = (BookingDetailsUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$5;
                List list10 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$4;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState15 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                CardRechargeSummaryData cardRechargeSummaryData14 = (CardRechargeSummaryData) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                CurrencyFeature currencyFeature14 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                stringProvider8 = (StringProvider) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                str5 = str10;
                bookingDetailsUIState2 = bookingDetailsUIState5;
                list3 = list10;
                cardRechargeSummaryData4 = cardRechargeSummaryData14;
                chaloTextStyleHelper8 = chaloTextStyleHelper19;
                objB8 = objA;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3 = cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1;
                toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState15;
                currencyFeature7 = currencyFeature14;
                UIFontWeight uIFontWeight11 = UIFontWeight.SemiBold;
                StringProvider stringProvider114 = stringProvider8;
                TitleSubtitleUiState titleSubtitleUiState17 = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB8, null, null, uIFontWeight11, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), ChaloTextStyleHelper.c(chaloTextStyleHelper9, str5, null, null, uIFontWeight11, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9);
                if (list4.isEmpty()) {
                    dashedLineUIState = new DashedLineUIState();
                } else {
                    dashedLineUIState = null;
                }
                priceDetailsUIState = new PriceDetailsUIState(chaloTextUIStateF2, titleSubtitleUiState17, list4, dashedLineUIState);
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$0 = toolBarWithRightComponentUIState3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$1 = list3;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$2 = bookingDetailsUIState2;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$3 = priceDetailsUIState;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$4 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$5 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$6 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$7 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$8 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.L$9 = null;
                cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3.label = 11;
                objA = a(cardRechargeSummaryData4, currencyFeature7, stringProvider114, cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$3);
                if (objA != coroutineSingletons) {
                    bookingDetailsUIState3 = bookingDetailsUIState2;
                    list5 = list3;
                    priceDetailsUIState2 = priceDetailsUIState;
                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
                }
                return coroutineSingletons;
            case 11:
                PriceDetailsUIState priceDetailsUIState3 = (PriceDetailsUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$3;
                BookingDetailsUIState bookingDetailsUIState6 = (BookingDetailsUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$2;
                List list11 = (List) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$1;
                toolBarWithRightComponentUIState3 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardRechargeBookingSummaryUIState$1.L$0;
                ResultKt.b(objA);
                priceDetailsUIState2 = priceDetailsUIState3;
                bookingDetailsUIState3 = bookingDetailsUIState6;
                list5 = list11;
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState3, list5, (TicketInfoUIState) objA, bookingDetailsUIState3, null, priceDetailsUIState2, null, null, null, 3969);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0274  */
    /* JADX WARN: Code duplicated, block: B:32:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:36:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0340  */
    /* JADX WARN: Code duplicated, block: B:40:0x0345  */
    /* JADX WARN: Code duplicated, block: B:43:0x034c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0370  */
    /* JADX WARN: Code duplicated, block: B:49:0x0396  */
    /* JADX WARN: Code duplicated, block: B:50:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:56:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x0475  */
    /* JADX WARN: Code duplicated, block: B:71:0x0508  */
    /* JADX WARN: Code duplicated, block: B:74:0x0511  */
    /* JADX WARN: Code duplicated, block: B:77:0x0555  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0594  */
    public static final Object d(GetProductStatusUIForSummaryScreen getProductStatusUIForSummaryScreen, ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking cardTransactionReceiptBooking, ProductReceiptData productReceiptData, String str, StringProvider stringProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, ContinuationImpl continuationImpl) {
        CardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1 cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1;
        ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking cardTransactionReceiptBooking2;
        ProductReceiptData productReceiptData2;
        String str2;
        CurrencyFeature currencyFeature2;
        GetProductStatusUIForSummaryScreen getProductStatusUIForSummaryScreen2;
        TimeUtilsContract timeUtilsContract2;
        Object obj;
        ChaloTextStyleHelper chaloTextStyleHelper;
        ChaloColorToken.AlmostBlackColor almostBlackColor;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState;
        Object objD;
        StringProvider stringProvider2;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState2;
        TimeUtilsContract timeUtilsContract3;
        String str3;
        ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking cardTransactionReceiptBooking3;
        CurrencyFeature currencyFeature3;
        ProductReceiptData productReceiptData3;
        List list;
        Object objB;
        ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking cardTransactionReceiptBooking4;
        String str4;
        List list2;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        Object objB2;
        List list3;
        ProductReceiptData productReceiptData4;
        StringProvider stringProvider3;
        TimeUtilsContract timeUtilsContract4;
        String str5;
        CurrencyFeature currencyFeature4;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        TitleSubtitleUiState titleSubtitleUiState;
        String strR;
        TitleSubtitleUiState titleSubtitleUiState2;
        TitleSubtitleUiState titleSubtitleUiState3;
        Object objB3;
        ProductReceiptData productReceiptData5;
        TitleSubtitleUiState titleSubtitleUiState4;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        BookingDetailsUIState bookingDetailsUIState;
        ChaloColorToken.AlmostBlackColor almostBlackColor2;
        ProductSummaryStatusUiData productSummaryStatusUiData;
        StringProvider stringProvider4;
        PriceDetailsUIState priceDetailsUIState;
        ProductReceiptData productReceiptData6;
        Long amount;
        ChaloColorToken.AlmostBlackColor almostBlackColor3;
        List list4;
        String str6;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState5;
        StringProvider stringProvider5;
        TimeUtilsContract timeUtilsContract5;
        CurrencyFeature currencyFeature5;
        BookingDetailsUIState bookingDetailsUIState2;
        ProductReceiptData productReceiptData7;
        long j;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        TextUIState.ChaloTextUIState chaloTextUIStateC;
        TextUIState.ChaloTextUIState chaloTextUIStateF2;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        BookingDetailsUIState bookingDetailsUIState3;
        List list5;
        PriceDetailsUIState priceDetailsUIState2;
        TicketInfoUIState ticketInfoUIState;
        List list6;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState6;
        ProductSummaryStatusUiData productSummaryStatusUiData2;
        ImageUIState imageUIState;
        ChaloColorToken.SectionDividerColor sectionDividerColor;
        Object objB4;
        ImageUIState imageUIState2;
        ToolBarWithRightComponentUIState toolBarWithRightComponentUIState7;
        ChaloColorToken chaloColorToken;
        List list7;
        StringProvider stringProvider6 = stringProvider;
        if (continuationImpl instanceof CardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1) {
            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1 = (CardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1) continuationImpl;
            int i = cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1 = new CardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1(continuationImpl);
            }
        } else {
            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1 = new CardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1(continuationImpl);
        }
        Object objB5 = cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label;
        ChaloColorToken.AlmostBlackColor almostBlackColor4 = ChaloColorToken.AlmostBlackColor.f9756a;
        ChaloTextStyleHelper chaloTextStyleHelper7 = ChaloTextStyleHelper.f10078a;
        switch (i2) {
            case 0:
                ResultKt.b(objB5);
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = getProductStatusUIForSummaryScreen;
                cardTransactionReceiptBooking2 = cardTransactionReceiptBooking;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = cardTransactionReceiptBooking2;
                productReceiptData2 = productReceiptData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = productReceiptData2;
                str2 = str;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = str2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = stringProvider6;
                currencyFeature2 = currencyFeature;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = currencyFeature2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = timeUtilsContract;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 1;
                Object objB6 = stringProvider6.b(StringEnum.RIDE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                if (objB6 != coroutineSingletons) {
                    getProductStatusUIForSummaryScreen2 = getProductStatusUIForSummaryScreen;
                    timeUtilsContract2 = timeUtilsContract;
                    obj = objB6;
                    chaloTextStyleHelper = chaloTextStyleHelper7;
                    ChaloTextStyleHelper chaloTextStyleHelper8 = chaloTextStyleHelper;
                    almostBlackColor = almostBlackColor4;
                    toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper8, (String) obj, almostBlackColor4, null, null, null, 124), null, null, null, 0.0f, null, null, 253), null, 1);
                    we weVar = new we(1);
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider6;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = null;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 2;
                    objD = getProductStatusUIForSummaryScreen2.d(cardTransactionReceiptBooking2, null, weVar, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                    if (objD != coroutineSingletons) {
                        ProductReceiptData productReceiptData8 = productReceiptData2;
                        stringProvider2 = stringProvider6;
                        toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                        timeUtilsContract3 = timeUtilsContract2;
                        str3 = str2;
                        cardTransactionReceiptBooking3 = cardTransactionReceiptBooking2;
                        currencyFeature3 = currencyFeature2;
                        productReceiptData3 = productReceiptData8;
                        list = (List) objD;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider2;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState2;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = list;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextStyleHelper7;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 3;
                        objB = stringProvider2.b(StringEnum.BOOKING_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                        if (objB != coroutineSingletons) {
                            cardTransactionReceiptBooking4 = cardTransactionReceiptBooking3;
                            str4 = str3;
                            list2 = list;
                            toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                            chaloTextStyleHelper2 = chaloTextStyleHelper7;
                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB, almostBlackColor, null, null, 124);
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider2;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = list2;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextUIStateF;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 4;
                            objB2 = stringProvider2.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                            if (objB2 != coroutineSingletons) {
                                TimeUtilsContract timeUtilsContract6 = timeUtilsContract3;
                                list3 = list2;
                                productReceiptData4 = productReceiptData3;
                                stringProvider3 = stringProvider2;
                                timeUtilsContract4 = timeUtilsContract6;
                                str5 = str4;
                                currencyFeature4 = currencyFeature3;
                                toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                                chaloTextUIState = chaloTextUIStateF;
                                chaloTextStyleHelper3 = chaloTextStyleHelper7;
                                titleSubtitleUiState = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper7, cardTransactionReceiptBooking4.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                                if (productReceiptData4 != null) {
                                    strR = productReceiptData4.r();
                                } else {
                                    strR = null;
                                }
                                if (!AnyExtsKt.a(strR)) {
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = str5;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = stringProvider3;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = currencyFeature4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = timeUtilsContract4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = list3;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextUIState;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = titleSubtitleUiState;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 5;
                                    objB3 = stringProvider3.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                    if (objB3 != coroutineSingletons) {
                                        productReceiptData5 = productReceiptData4;
                                        titleSubtitleUiState4 = titleSubtitleUiState;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper7;
                                        TextUIState.ChaloTextUIState chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                        if (productReceiptData5 != null) {
                                            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, productReceiptData5.r(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                        } else {
                                            chaloTextUIStateC = null;
                                        }
                                        titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC2, chaloTextUIStateC, null, 9);
                                        titleSubtitleUiState2 = titleSubtitleUiState4;
                                        productReceiptData4 = productReceiptData5;
                                        bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                                        if (productReceiptData4 != null || (amount = productReceiptData4.getAmount()) == null) {
                                            almostBlackColor2 = almostBlackColor;
                                            productSummaryStatusUiData = null;
                                            stringProvider4 = stringProvider3;
                                            priceDetailsUIState = null;
                                            productReceiptData6 = productReceiptData4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                                            objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                            if (objB5 != coroutineSingletons) {
                                                List list8 = list3;
                                                bookingDetailsUIState3 = bookingDetailsUIState;
                                                list5 = list8;
                                                priceDetailsUIState2 = priceDetailsUIState;
                                                ticketInfoUIState = (TicketInfoUIState) objB5;
                                                if (productReceiptData6 == null) {
                                                    imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                                    sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                                    objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                                    if (objB4 != coroutineSingletons) {
                                                        imageUIState2 = imageUIState;
                                                        objB5 = objB4;
                                                        toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                                        chaloColorToken = sectionDividerColor;
                                                        list7 = list5;
                                                        ProductSummaryStatusUiData productSummaryStatusUiData3 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                                        toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                                        list6 = list7;
                                                        productSummaryStatusUiData2 = productSummaryStatusUiData3;
                                                    }
                                                } else {
                                                    list6 = list5;
                                                    toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                }
                                                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                                            }
                                        } else {
                                            long jLongValue = amount.longValue();
                                            almostBlackColor3 = almostBlackColor;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = str5;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = stringProvider3;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = currencyFeature4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = timeUtilsContract4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = list3;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = bookingDetailsUIState;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextStyleHelper7;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = null;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.J$0 = jLongValue;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 6;
                                            objB5 = stringProvider3.b(StringEnum.PRICE_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                            if (objB5 != coroutineSingletons) {
                                                StringProvider stringProvider7 = stringProvider3;
                                                list4 = list3;
                                                str6 = str5;
                                                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState4;
                                                stringProvider5 = stringProvider7;
                                                timeUtilsContract5 = timeUtilsContract4;
                                                currencyFeature5 = currencyFeature4;
                                                bookingDetailsUIState2 = bookingDetailsUIState;
                                                productReceiptData7 = productReceiptData4;
                                                j = jLongValue;
                                                chaloTextStyleHelper5 = chaloTextStyleHelper7;
                                                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) objB5, almostBlackColor3, null, null, 124);
                                                almostBlackColor2 = almostBlackColor3;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData7;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = str6;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = stringProvider5;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = currencyFeature5;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = timeUtilsContract5;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = toolBarWithRightComponentUIState5;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = list4;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = bookingDetailsUIState2;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextUIStateF2;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.J$0 = j;
                                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 7;
                                                objB5 = stringProvider5.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                                coroutineSingletons = coroutineSingletons;
                                                if (objB5 != coroutineSingletons) {
                                                    chaloTextStyleHelper6 = chaloTextStyleHelper7;
                                                    UIFontWeight uIFontWeight = UIFontWeight.SemiBold;
                                                    TextUIState.ChaloTextUIState chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) objB5, null, null, uIFontWeight, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                                                    ProductReceiptData productReceiptData9 = productReceiptData7;
                                                    productSummaryStatusUiData = null;
                                                    PriceDetailsUIState priceDetailsUIState3 = new PriceDetailsUIState(chaloTextUIStateF2, new TitleSubtitleUiState(null, chaloTextUIStateC3, ChaloTextStyleHelper.c(chaloTextStyleHelper7, currencyFeature5.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), null, null, uIFontWeight, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9), EmptyList.f17557a, null);
                                                    bookingDetailsUIState = bookingDetailsUIState2;
                                                    timeUtilsContract4 = timeUtilsContract5;
                                                    priceDetailsUIState = priceDetailsUIState3;
                                                    stringProvider4 = stringProvider5;
                                                    toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState5;
                                                    str5 = str6;
                                                    list3 = list4;
                                                    productReceiptData6 = productReceiptData9;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                                                    objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                                    if (objB5 != coroutineSingletons) {
                                                        List list9 = list3;
                                                        bookingDetailsUIState3 = bookingDetailsUIState;
                                                        list5 = list9;
                                                        priceDetailsUIState2 = priceDetailsUIState;
                                                        ticketInfoUIState = (TicketInfoUIState) objB5;
                                                        if (productReceiptData6 == null) {
                                                            imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                                            sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                                            objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                                            if (objB4 != coroutineSingletons) {
                                                                imageUIState2 = imageUIState;
                                                                objB5 = objB4;
                                                                toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                                                chaloColorToken = sectionDividerColor;
                                                                list7 = list5;
                                                                ProductSummaryStatusUiData productSummaryStatusUiData4 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                                                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                                                list6 = list7;
                                                                productSummaryStatusUiData2 = productSummaryStatusUiData4;
                                                            }
                                                        } else {
                                                            list6 = list5;
                                                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                                                        }
                                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    titleSubtitleUiState2 = titleSubtitleUiState;
                                    titleSubtitleUiState3 = null;
                                    bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                                    if (productReceiptData4 != null) {
                                    }
                                    almostBlackColor2 = almostBlackColor;
                                    productSummaryStatusUiData = null;
                                    stringProvider4 = stringProvider3;
                                    priceDetailsUIState = null;
                                    productReceiptData6 = productReceiptData4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                                    objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                    if (objB5 != coroutineSingletons) {
                                        List list10 = list3;
                                        bookingDetailsUIState3 = bookingDetailsUIState;
                                        list5 = list10;
                                        priceDetailsUIState2 = priceDetailsUIState;
                                        ticketInfoUIState = (TicketInfoUIState) objB5;
                                        if (productReceiptData6 == null) {
                                            imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                            sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                            objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                            if (objB4 != coroutineSingletons) {
                                                imageUIState2 = imageUIState;
                                                objB5 = objB4;
                                                toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                                chaloColorToken = sectionDividerColor;
                                                list7 = list5;
                                                ProductSummaryStatusUiData productSummaryStatusUiData5 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                                list6 = list7;
                                                productSummaryStatusUiData2 = productSummaryStatusUiData5;
                                            }
                                        } else {
                                            list6 = list5;
                                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        }
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ChaloTextStyleHelper chaloTextStyleHelper9 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7;
                timeUtilsContract2 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6;
                CurrencyFeature currencyFeature6 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                StringProvider stringProvider8 = (StringProvider) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                String str7 = (String) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                ProductReceiptData productReceiptData10 = (ProductReceiptData) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking cardTransactionReceiptBooking5 = (ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                getProductStatusUIForSummaryScreen2 = (GetProductStatusUIForSummaryScreen) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                chaloTextStyleHelper = chaloTextStyleHelper9;
                stringProvider6 = stringProvider8;
                cardTransactionReceiptBooking2 = cardTransactionReceiptBooking5;
                currencyFeature2 = currencyFeature6;
                obj = objB5;
                str2 = str7;
                productReceiptData2 = productReceiptData10;
                ChaloTextStyleHelper chaloTextStyleHelper10 = chaloTextStyleHelper;
                almostBlackColor = almostBlackColor4;
                toolBarWithRightComponentUIState = new ToolBarWithRightComponentUIState(new ToolbarUIState(null, ChaloTextStyleHelper.e(chaloTextStyleHelper10, (String) obj, almostBlackColor4, null, null, null, 124), null, null, null, 0.0f, null, null, 253), null, 1);
                we weVar2 = new we(1);
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider6;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = null;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 2;
                objD = getProductStatusUIForSummaryScreen2.d(cardTransactionReceiptBooking2, null, weVar2, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                if (objD != coroutineSingletons) {
                    ProductReceiptData productReceiptData11 = productReceiptData2;
                    stringProvider2 = stringProvider6;
                    toolBarWithRightComponentUIState2 = toolBarWithRightComponentUIState;
                    timeUtilsContract3 = timeUtilsContract2;
                    str3 = str2;
                    cardTransactionReceiptBooking3 = cardTransactionReceiptBooking2;
                    currencyFeature3 = currencyFeature2;
                    productReceiptData3 = productReceiptData11;
                    list = (List) objD;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = list;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextStyleHelper7;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 3;
                    objB = stringProvider2.b(StringEnum.BOOKING_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                    if (objB != coroutineSingletons) {
                        cardTransactionReceiptBooking4 = cardTransactionReceiptBooking3;
                        str4 = str3;
                        list2 = list;
                        toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                        chaloTextStyleHelper2 = chaloTextStyleHelper7;
                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB, almostBlackColor, null, null, 124);
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider2;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = list2;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextUIStateF;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 4;
                        objB2 = stringProvider2.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                        if (objB2 != coroutineSingletons) {
                            TimeUtilsContract timeUtilsContract7 = timeUtilsContract3;
                            list3 = list2;
                            productReceiptData4 = productReceiptData3;
                            stringProvider3 = stringProvider2;
                            timeUtilsContract4 = timeUtilsContract7;
                            str5 = str4;
                            currencyFeature4 = currencyFeature3;
                            toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                            chaloTextUIState = chaloTextUIStateF;
                            chaloTextStyleHelper3 = chaloTextStyleHelper7;
                            titleSubtitleUiState = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper7, cardTransactionReceiptBooking4.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                            if (productReceiptData4 != null) {
                                strR = productReceiptData4.r();
                            } else {
                                strR = null;
                            }
                            if (!AnyExtsKt.a(strR)) {
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = str5;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = stringProvider3;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = currencyFeature4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = timeUtilsContract4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = list3;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextUIState;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = titleSubtitleUiState;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 5;
                                objB3 = stringProvider3.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                if (objB3 != coroutineSingletons) {
                                    productReceiptData5 = productReceiptData4;
                                    titleSubtitleUiState4 = titleSubtitleUiState;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper7;
                                    TextUIState.ChaloTextUIState chaloTextUIStateC4 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                    if (productReceiptData5 != null) {
                                        chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, productReceiptData5.r(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                    } else {
                                        chaloTextUIStateC = null;
                                    }
                                    titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC4, chaloTextUIStateC, null, 9);
                                    titleSubtitleUiState2 = titleSubtitleUiState4;
                                    productReceiptData4 = productReceiptData5;
                                    bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                                    if (productReceiptData4 != null) {
                                    }
                                    almostBlackColor2 = almostBlackColor;
                                    productSummaryStatusUiData = null;
                                    stringProvider4 = stringProvider3;
                                    priceDetailsUIState = null;
                                    productReceiptData6 = productReceiptData4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                                    objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                    if (objB5 != coroutineSingletons) {
                                        List list11 = list3;
                                        bookingDetailsUIState3 = bookingDetailsUIState;
                                        list5 = list11;
                                        priceDetailsUIState2 = priceDetailsUIState;
                                        ticketInfoUIState = (TicketInfoUIState) objB5;
                                        if (productReceiptData6 == null) {
                                            imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                            sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                            objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                            if (objB4 != coroutineSingletons) {
                                                imageUIState2 = imageUIState;
                                                objB5 = objB4;
                                                toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                                chaloColorToken = sectionDividerColor;
                                                list7 = list5;
                                                ProductSummaryStatusUiData productSummaryStatusUiData6 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                                list6 = list7;
                                                productSummaryStatusUiData2 = productSummaryStatusUiData6;
                                            }
                                        } else {
                                            list6 = list5;
                                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                                        }
                                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                                    }
                                }
                            } else {
                                titleSubtitleUiState2 = titleSubtitleUiState;
                                titleSubtitleUiState3 = null;
                                bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                                if (productReceiptData4 != null) {
                                }
                                almostBlackColor2 = almostBlackColor;
                                productSummaryStatusUiData = null;
                                stringProvider4 = stringProvider3;
                                priceDetailsUIState = null;
                                productReceiptData6 = productReceiptData4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                                objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                if (objB5 != coroutineSingletons) {
                                    List list12 = list3;
                                    bookingDetailsUIState3 = bookingDetailsUIState;
                                    list5 = list12;
                                    priceDetailsUIState2 = priceDetailsUIState;
                                    ticketInfoUIState = (TicketInfoUIState) objB5;
                                    if (productReceiptData6 == null) {
                                        imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                        sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                        objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                        if (objB4 != coroutineSingletons) {
                                            imageUIState2 = imageUIState;
                                            objB5 = objB4;
                                            toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                            chaloColorToken = sectionDividerColor;
                                            list7 = list5;
                                            ProductSummaryStatusUiData productSummaryStatusUiData7 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                            list6 = list7;
                                            productSummaryStatusUiData2 = productSummaryStatusUiData7;
                                        }
                                    } else {
                                        list6 = list5;
                                        toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                    }
                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                                }
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 2:
                toolBarWithRightComponentUIState2 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6;
                TimeUtilsContract timeUtilsContract8 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                CurrencyFeature currencyFeature7 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                StringProvider stringProvider9 = (StringProvider) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                String str8 = (String) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData12 = (ProductReceiptData) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                cardTransactionReceiptBooking3 = (ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                productReceiptData3 = productReceiptData12;
                stringProvider2 = stringProvider9;
                timeUtilsContract3 = timeUtilsContract8;
                str3 = str8;
                currencyFeature3 = currencyFeature7;
                objD = objB5;
                almostBlackColor = almostBlackColor4;
                list = (List) objD;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = list;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextStyleHelper7;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 3;
                objB = stringProvider2.b(StringEnum.BOOKING_DETAILS, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                if (objB != coroutineSingletons) {
                    cardTransactionReceiptBooking4 = cardTransactionReceiptBooking3;
                    str4 = str3;
                    list2 = list;
                    toolBarWithRightComponentUIState3 = toolBarWithRightComponentUIState2;
                    chaloTextStyleHelper2 = chaloTextStyleHelper7;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB, almostBlackColor, null, null, 124);
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = list2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextUIStateF;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 4;
                    objB2 = stringProvider2.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                    if (objB2 != coroutineSingletons) {
                        TimeUtilsContract timeUtilsContract9 = timeUtilsContract3;
                        list3 = list2;
                        productReceiptData4 = productReceiptData3;
                        stringProvider3 = stringProvider2;
                        timeUtilsContract4 = timeUtilsContract9;
                        str5 = str4;
                        currencyFeature4 = currencyFeature3;
                        toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                        chaloTextUIState = chaloTextUIStateF;
                        chaloTextStyleHelper3 = chaloTextStyleHelper7;
                        titleSubtitleUiState = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper7, cardTransactionReceiptBooking4.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                        if (productReceiptData4 != null) {
                            strR = productReceiptData4.r();
                        } else {
                            strR = null;
                        }
                        if (!AnyExtsKt.a(strR)) {
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = str5;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = stringProvider3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = currencyFeature4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = timeUtilsContract4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = list3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextUIState;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = titleSubtitleUiState;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 5;
                            objB3 = stringProvider3.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                            if (objB3 != coroutineSingletons) {
                                productReceiptData5 = productReceiptData4;
                                titleSubtitleUiState4 = titleSubtitleUiState;
                                chaloTextStyleHelper4 = chaloTextStyleHelper7;
                                TextUIState.ChaloTextUIState chaloTextUIStateC5 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                if (productReceiptData5 != null) {
                                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, productReceiptData5.r(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                } else {
                                    chaloTextUIStateC = null;
                                }
                                titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC5, chaloTextUIStateC, null, 9);
                                titleSubtitleUiState2 = titleSubtitleUiState4;
                                productReceiptData4 = productReceiptData5;
                                bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                                if (productReceiptData4 != null) {
                                }
                                almostBlackColor2 = almostBlackColor;
                                productSummaryStatusUiData = null;
                                stringProvider4 = stringProvider3;
                                priceDetailsUIState = null;
                                productReceiptData6 = productReceiptData4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                                objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                if (objB5 != coroutineSingletons) {
                                    List list13 = list3;
                                    bookingDetailsUIState3 = bookingDetailsUIState;
                                    list5 = list13;
                                    priceDetailsUIState2 = priceDetailsUIState;
                                    ticketInfoUIState = (TicketInfoUIState) objB5;
                                    if (productReceiptData6 == null) {
                                        imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                        sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                        objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                        if (objB4 != coroutineSingletons) {
                                            imageUIState2 = imageUIState;
                                            objB5 = objB4;
                                            toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                            chaloColorToken = sectionDividerColor;
                                            list7 = list5;
                                            ProductSummaryStatusUiData productSummaryStatusUiData8 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                            list6 = list7;
                                            productSummaryStatusUiData2 = productSummaryStatusUiData8;
                                        }
                                    } else {
                                        list6 = list5;
                                        toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                                    }
                                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                                }
                            }
                        } else {
                            titleSubtitleUiState2 = titleSubtitleUiState;
                            titleSubtitleUiState3 = null;
                            bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                            if (productReceiptData4 != null) {
                            }
                            almostBlackColor2 = almostBlackColor;
                            productSummaryStatusUiData = null;
                            stringProvider4 = stringProvider3;
                            priceDetailsUIState = null;
                            productReceiptData6 = productReceiptData4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                            objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                            if (objB5 != coroutineSingletons) {
                                List list14 = list3;
                                bookingDetailsUIState3 = bookingDetailsUIState;
                                list5 = list14;
                                priceDetailsUIState2 = priceDetailsUIState;
                                ticketInfoUIState = (TicketInfoUIState) objB5;
                                if (productReceiptData6 == null) {
                                    imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                    sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                    objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                    if (objB4 != coroutineSingletons) {
                                        imageUIState2 = imageUIState;
                                        objB5 = objB4;
                                        toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                        chaloColorToken = sectionDividerColor;
                                        list7 = list5;
                                        ProductSummaryStatusUiData productSummaryStatusUiData9 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                        toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                        list6 = list7;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData9;
                                    }
                                } else {
                                    list6 = list5;
                                    toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                }
                                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                            }
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 3:
                chaloTextStyleHelper2 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8;
                list2 = (List) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7;
                toolBarWithRightComponentUIState3 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6;
                timeUtilsContract3 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                currencyFeature3 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                stringProvider2 = (StringProvider) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                str4 = (String) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                productReceiptData3 = (ProductReceiptData) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking cardTransactionReceiptBooking6 = (ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                objB = objB5;
                almostBlackColor = almostBlackColor4;
                cardTransactionReceiptBooking4 = cardTransactionReceiptBooking6;
                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper2, (String) objB, almostBlackColor, null, null, 124);
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = cardTransactionReceiptBooking4;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = productReceiptData3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = str4;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = stringProvider2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = currencyFeature3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = timeUtilsContract3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = toolBarWithRightComponentUIState3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = list2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextUIStateF;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 4;
                objB2 = stringProvider2.b(StringEnum.BOOKING_ID, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                if (objB2 != coroutineSingletons) {
                    TimeUtilsContract timeUtilsContract10 = timeUtilsContract3;
                    list3 = list2;
                    productReceiptData4 = productReceiptData3;
                    stringProvider3 = stringProvider2;
                    timeUtilsContract4 = timeUtilsContract10;
                    str5 = str4;
                    currencyFeature4 = currencyFeature3;
                    toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState3;
                    chaloTextUIState = chaloTextUIStateF;
                    chaloTextStyleHelper3 = chaloTextStyleHelper7;
                    titleSubtitleUiState = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper7, cardTransactionReceiptBooking4.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                    if (productReceiptData4 != null) {
                        strR = productReceiptData4.r();
                    } else {
                        strR = null;
                    }
                    if (!AnyExtsKt.a(strR)) {
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = str5;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = stringProvider3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = currencyFeature4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = timeUtilsContract4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = list3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextUIState;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = titleSubtitleUiState;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 5;
                        objB3 = stringProvider3.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                        if (objB3 != coroutineSingletons) {
                            productReceiptData5 = productReceiptData4;
                            titleSubtitleUiState4 = titleSubtitleUiState;
                            chaloTextStyleHelper4 = chaloTextStyleHelper7;
                            TextUIState.ChaloTextUIState chaloTextUIStateC6 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                            if (productReceiptData5 != null) {
                                chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, productReceiptData5.r(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                            } else {
                                chaloTextUIStateC = null;
                            }
                            titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC6, chaloTextUIStateC, null, 9);
                            titleSubtitleUiState2 = titleSubtitleUiState4;
                            productReceiptData4 = productReceiptData5;
                            bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                            if (productReceiptData4 != null) {
                            }
                            almostBlackColor2 = almostBlackColor;
                            productSummaryStatusUiData = null;
                            stringProvider4 = stringProvider3;
                            priceDetailsUIState = null;
                            productReceiptData6 = productReceiptData4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                            objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                            if (objB5 != coroutineSingletons) {
                                List list15 = list3;
                                bookingDetailsUIState3 = bookingDetailsUIState;
                                list5 = list15;
                                priceDetailsUIState2 = priceDetailsUIState;
                                ticketInfoUIState = (TicketInfoUIState) objB5;
                                if (productReceiptData6 == null) {
                                    imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                    sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                    objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                    if (objB4 != coroutineSingletons) {
                                        imageUIState2 = imageUIState;
                                        objB5 = objB4;
                                        toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                        chaloColorToken = sectionDividerColor;
                                        list7 = list5;
                                        ProductSummaryStatusUiData productSummaryStatusUiData10 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                        toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                        list6 = list7;
                                        productSummaryStatusUiData2 = productSummaryStatusUiData10;
                                    }
                                } else {
                                    list6 = list5;
                                    toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                    productSummaryStatusUiData2 = productSummaryStatusUiData;
                                }
                                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                            }
                        }
                    } else {
                        titleSubtitleUiState2 = titleSubtitleUiState;
                        titleSubtitleUiState3 = null;
                        bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                        if (productReceiptData4 != null) {
                        }
                        almostBlackColor2 = almostBlackColor;
                        productSummaryStatusUiData = null;
                        stringProvider4 = stringProvider3;
                        priceDetailsUIState = null;
                        productReceiptData6 = productReceiptData4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                        objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                        if (objB5 != coroutineSingletons) {
                            List list16 = list3;
                            bookingDetailsUIState3 = bookingDetailsUIState;
                            list5 = list16;
                            priceDetailsUIState2 = priceDetailsUIState;
                            ticketInfoUIState = (TicketInfoUIState) objB5;
                            if (productReceiptData6 == null) {
                                imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                if (objB4 != coroutineSingletons) {
                                    imageUIState2 = imageUIState;
                                    objB5 = objB4;
                                    toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                    chaloColorToken = sectionDividerColor;
                                    list7 = list5;
                                    ProductSummaryStatusUiData productSummaryStatusUiData11 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                    toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                    list6 = list7;
                                    productSummaryStatusUiData2 = productSummaryStatusUiData11;
                                }
                            } else {
                                list6 = list5;
                                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                productSummaryStatusUiData2 = productSummaryStatusUiData;
                            }
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                chaloTextStyleHelper3 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9;
                TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8;
                List list17 = (List) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState8 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6;
                TimeUtilsContract timeUtilsContract11 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                CurrencyFeature currencyFeature8 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                StringProvider stringProvider10 = (StringProvider) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                String str9 = (String) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                ProductReceiptData productReceiptData13 = (ProductReceiptData) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                cardTransactionReceiptBooking4 = (ChaloUserBookingType.CardBooking.CardTransactionReceiptBooking) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                objB2 = objB5;
                almostBlackColor = almostBlackColor4;
                chaloTextUIState = chaloTextUIState2;
                productReceiptData4 = productReceiptData13;
                str5 = str9;
                stringProvider3 = stringProvider10;
                currencyFeature4 = currencyFeature8;
                timeUtilsContract4 = timeUtilsContract11;
                toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState8;
                list3 = list17;
                titleSubtitleUiState = new TitleSubtitleUiState(null, ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB2, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), ChaloTextStyleHelper.c(chaloTextStyleHelper7, cardTransactionReceiptBooking4.d, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT), null, 9);
                if (productReceiptData4 != null) {
                    strR = productReceiptData4.r();
                } else {
                    strR = null;
                }
                if (!AnyExtsKt.a(strR)) {
                    titleSubtitleUiState2 = titleSubtitleUiState;
                    titleSubtitleUiState3 = null;
                    bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                    if (productReceiptData4 != null) {
                    }
                    almostBlackColor2 = almostBlackColor;
                    productSummaryStatusUiData = null;
                    stringProvider4 = stringProvider3;
                    priceDetailsUIState = null;
                    productReceiptData6 = productReceiptData4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                    objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                    if (objB5 != coroutineSingletons) {
                        List list18 = list3;
                        bookingDetailsUIState3 = bookingDetailsUIState;
                        list5 = list18;
                        priceDetailsUIState2 = priceDetailsUIState;
                        ticketInfoUIState = (TicketInfoUIState) objB5;
                        if (productReceiptData6 == null) {
                            imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                            sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                            objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                            if (objB4 != coroutineSingletons) {
                                imageUIState2 = imageUIState;
                                objB5 = objB4;
                                toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                chaloColorToken = sectionDividerColor;
                                list7 = list5;
                                ProductSummaryStatusUiData productSummaryStatusUiData12 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                list6 = list7;
                                productSummaryStatusUiData2 = productSummaryStatusUiData12;
                            }
                        } else {
                            list6 = list5;
                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                        }
                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                    }
                    break;
                } else {
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = str5;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = stringProvider3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = currencyFeature4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = timeUtilsContract4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = toolBarWithRightComponentUIState4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = list3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextUIState;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = titleSubtitleUiState;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 5;
                    objB3 = stringProvider3.b(StringEnum.PAYMENT_MODE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                    if (objB3 != coroutineSingletons) {
                        productReceiptData5 = productReceiptData4;
                        titleSubtitleUiState4 = titleSubtitleUiState;
                        chaloTextStyleHelper4 = chaloTextStyleHelper7;
                        TextUIState.ChaloTextUIState chaloTextUIStateC7 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        if (productReceiptData5 != null) {
                            chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, productReceiptData5.r(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        } else {
                            chaloTextUIStateC = null;
                        }
                        titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC7, chaloTextUIStateC, null, 9);
                        titleSubtitleUiState2 = titleSubtitleUiState4;
                        productReceiptData4 = productReceiptData5;
                        bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                        if (productReceiptData4 != null) {
                        }
                        almostBlackColor2 = almostBlackColor;
                        productSummaryStatusUiData = null;
                        stringProvider4 = stringProvider3;
                        priceDetailsUIState = null;
                        productReceiptData6 = productReceiptData4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                        objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                        if (objB5 != coroutineSingletons) {
                            List list19 = list3;
                            bookingDetailsUIState3 = bookingDetailsUIState;
                            list5 = list19;
                            priceDetailsUIState2 = priceDetailsUIState;
                            ticketInfoUIState = (TicketInfoUIState) objB5;
                            if (productReceiptData6 == null) {
                                imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                                sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                                objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                                if (objB4 != coroutineSingletons) {
                                    imageUIState2 = imageUIState;
                                    objB5 = objB4;
                                    toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                    chaloColorToken = sectionDividerColor;
                                    list7 = list5;
                                    ProductSummaryStatusUiData productSummaryStatusUiData13 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                    toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                    list6 = list7;
                                    productSummaryStatusUiData2 = productSummaryStatusUiData13;
                                }
                            } else {
                                list6 = list5;
                                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                                productSummaryStatusUiData2 = productSummaryStatusUiData;
                            }
                            return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                        }
                    }
                    break;
                }
                return coroutineSingletons;
            case 5:
                chaloTextStyleHelper4 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9;
                titleSubtitleUiState4 = (TitleSubtitleUiState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8;
                chaloTextUIState = (TextUIState.ChaloTextUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7;
                list3 = (List) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6;
                toolBarWithRightComponentUIState4 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                timeUtilsContract4 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                currencyFeature4 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                stringProvider3 = (StringProvider) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                str5 = (String) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                productReceiptData5 = (ProductReceiptData) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                objB3 = objB5;
                almostBlackColor = almostBlackColor4;
                TextUIState.ChaloTextUIState chaloTextUIStateC8 = ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) objB3, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                if (productReceiptData5 != null) {
                    chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, productReceiptData5.r(), null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                } else {
                    chaloTextUIStateC = null;
                }
                titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC8, chaloTextUIStateC, null, 9);
                titleSubtitleUiState2 = titleSubtitleUiState4;
                productReceiptData4 = productReceiptData5;
                bookingDetailsUIState = new BookingDetailsUIState(chaloTextUIState, null, titleSubtitleUiState2, null, titleSubtitleUiState3, null, null, 104);
                if (productReceiptData4 != null) {
                    break;
                }
                almostBlackColor2 = almostBlackColor;
                productSummaryStatusUiData = null;
                stringProvider4 = stringProvider3;
                priceDetailsUIState = null;
                productReceiptData6 = productReceiptData4;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                if (objB5 != coroutineSingletons) {
                    List list110 = list3;
                    bookingDetailsUIState3 = bookingDetailsUIState;
                    list5 = list110;
                    priceDetailsUIState2 = priceDetailsUIState;
                    ticketInfoUIState = (TicketInfoUIState) objB5;
                    if (productReceiptData6 == null) {
                        imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                        sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                        objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                        if (objB4 != coroutineSingletons) {
                            imageUIState2 = imageUIState;
                            objB5 = objB4;
                            toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                            chaloColorToken = sectionDividerColor;
                            list7 = list5;
                            ProductSummaryStatusUiData productSummaryStatusUiData14 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                            list6 = list7;
                            productSummaryStatusUiData2 = productSummaryStatusUiData14;
                        }
                    } else {
                        list6 = list5;
                        toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                    }
                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                }
                return coroutineSingletons;
            case 6:
                j = cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.J$0;
                ChaloTextStyleHelper chaloTextStyleHelper11 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8;
                BookingDetailsUIState bookingDetailsUIState4 = (BookingDetailsUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7;
                List list20 = (List) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState9 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                TimeUtilsContract timeUtilsContract12 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                CurrencyFeature currencyFeature9 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                StringProvider stringProvider11 = (StringProvider) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                String str10 = (String) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                ProductReceiptData productReceiptData14 = (ProductReceiptData) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                bookingDetailsUIState2 = bookingDetailsUIState4;
                str6 = str10;
                timeUtilsContract5 = timeUtilsContract12;
                almostBlackColor3 = almostBlackColor4;
                chaloTextStyleHelper5 = chaloTextStyleHelper11;
                productReceiptData7 = productReceiptData14;
                currencyFeature5 = currencyFeature9;
                list4 = list20;
                stringProvider5 = stringProvider11;
                toolBarWithRightComponentUIState5 = toolBarWithRightComponentUIState9;
                chaloTextUIStateF2 = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) objB5, almostBlackColor3, null, null, 124);
                almostBlackColor2 = almostBlackColor3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData7;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = str6;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = stringProvider5;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = currencyFeature5;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = timeUtilsContract5;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = toolBarWithRightComponentUIState5;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = list4;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = bookingDetailsUIState2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = chaloTextUIStateF2;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = chaloTextStyleHelper7;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.J$0 = j;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 7;
                objB5 = stringProvider5.b(StringEnum.TOTAL, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                coroutineSingletons = coroutineSingletons;
                if (objB5 != coroutineSingletons) {
                    chaloTextStyleHelper6 = chaloTextStyleHelper7;
                    UIFontWeight uIFontWeight2 = UIFontWeight.SemiBold;
                    TextUIState.ChaloTextUIState chaloTextUIStateC9 = ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) objB5, null, null, uIFontWeight2, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                    ProductReceiptData productReceiptData15 = productReceiptData7;
                    productSummaryStatusUiData = null;
                    PriceDetailsUIState priceDetailsUIState4 = new PriceDetailsUIState(chaloTextUIStateF2, new TitleSubtitleUiState(null, chaloTextUIStateC9, ChaloTextStyleHelper.c(chaloTextStyleHelper7, currencyFeature5.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), null, null, uIFontWeight2, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9), EmptyList.f17557a, null);
                    bookingDetailsUIState = bookingDetailsUIState2;
                    timeUtilsContract4 = timeUtilsContract5;
                    priceDetailsUIState = priceDetailsUIState4;
                    stringProvider4 = stringProvider5;
                    toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState5;
                    str5 = str6;
                    list3 = list4;
                    productReceiptData6 = productReceiptData15;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                    objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                    if (objB5 != coroutineSingletons) {
                        List list111 = list3;
                        bookingDetailsUIState3 = bookingDetailsUIState;
                        list5 = list111;
                        priceDetailsUIState2 = priceDetailsUIState;
                        ticketInfoUIState = (TicketInfoUIState) objB5;
                        if (productReceiptData6 == null) {
                            imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                            sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                            cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                            objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                            if (objB4 != coroutineSingletons) {
                                imageUIState2 = imageUIState;
                                objB5 = objB4;
                                toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                                chaloColorToken = sectionDividerColor;
                                list7 = list5;
                                ProductSummaryStatusUiData productSummaryStatusUiData15 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                                list6 = list7;
                                productSummaryStatusUiData2 = productSummaryStatusUiData15;
                            }
                        } else {
                            list6 = list5;
                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                            productSummaryStatusUiData2 = productSummaryStatusUiData;
                        }
                        return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                    }
                }
                return coroutineSingletons;
            case 7:
                j = cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.J$0;
                ChaloTextStyleHelper chaloTextStyleHelper12 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9;
                chaloTextUIStateF2 = (TextUIState.ChaloTextUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8;
                bookingDetailsUIState2 = (BookingDetailsUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7;
                list4 = (List) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6;
                toolBarWithRightComponentUIState5 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                timeUtilsContract5 = (TimeUtilsContract) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                currencyFeature5 = (CurrencyFeature) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                stringProvider5 = (StringProvider) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                str6 = (String) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                productReceiptData7 = (ProductReceiptData) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                almostBlackColor2 = almostBlackColor4;
                chaloTextStyleHelper6 = chaloTextStyleHelper12;
                UIFontWeight uIFontWeight3 = UIFontWeight.SemiBold;
                TextUIState.ChaloTextUIState chaloTextUIStateC10 = ChaloTextStyleHelper.c(chaloTextStyleHelper6, (String) objB5, null, null, uIFontWeight3, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                ProductReceiptData productReceiptData16 = productReceiptData7;
                productSummaryStatusUiData = null;
                PriceDetailsUIState priceDetailsUIState5 = new PriceDetailsUIState(chaloTextUIStateF2, new TitleSubtitleUiState(null, chaloTextUIStateC10, ChaloTextStyleHelper.c(chaloTextStyleHelper7, currencyFeature5.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), null, null, uIFontWeight3, null, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD), null, 9), EmptyList.f17557a, null);
                bookingDetailsUIState = bookingDetailsUIState2;
                timeUtilsContract4 = timeUtilsContract5;
                priceDetailsUIState = priceDetailsUIState5;
                stringProvider4 = stringProvider5;
                toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState5;
                str5 = str6;
                list3 = list4;
                productReceiptData6 = productReceiptData16;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = productReceiptData6;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = stringProvider4;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = toolBarWithRightComponentUIState4;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = list3;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = bookingDetailsUIState;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = priceDetailsUIState;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = productSummaryStatusUiData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = productSummaryStatusUiData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$8 = productSummaryStatusUiData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$9 = productSummaryStatusUiData;
                cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 8;
                objB5 = b(productReceiptData6, str5, timeUtilsContract4, stringProvider4, cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                if (objB5 != coroutineSingletons) {
                    List list112 = list3;
                    bookingDetailsUIState3 = bookingDetailsUIState;
                    list5 = list112;
                    priceDetailsUIState2 = priceDetailsUIState;
                    ticketInfoUIState = (TicketInfoUIState) objB5;
                    if (productReceiptData6 == null) {
                        imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                        sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                        cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                        objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                        if (objB4 != coroutineSingletons) {
                            imageUIState2 = imageUIState;
                            objB5 = objB4;
                            toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                            chaloColorToken = sectionDividerColor;
                            list7 = list5;
                            ProductSummaryStatusUiData productSummaryStatusUiData16 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                            toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                            list6 = list7;
                            productSummaryStatusUiData2 = productSummaryStatusUiData16;
                        }
                    } else {
                        list6 = list5;
                        toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                        productSummaryStatusUiData2 = productSummaryStatusUiData;
                    }
                    return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
                }
                return coroutineSingletons;
            case 8:
                PriceDetailsUIState priceDetailsUIState6 = (PriceDetailsUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                BookingDetailsUIState bookingDetailsUIState5 = (BookingDetailsUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                List list21 = (List) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                ToolBarWithRightComponentUIState toolBarWithRightComponentUIState10 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                stringProvider4 = (StringProvider) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                productReceiptData6 = (ProductReceiptData) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                priceDetailsUIState2 = priceDetailsUIState6;
                list5 = list21;
                bookingDetailsUIState3 = bookingDetailsUIState5;
                almostBlackColor2 = almostBlackColor4;
                toolBarWithRightComponentUIState4 = toolBarWithRightComponentUIState10;
                productSummaryStatusUiData = null;
                ticketInfoUIState = (TicketInfoUIState) objB5;
                if (productReceiptData6 == null) {
                    imageUIState = new ImageUIState(IconType.IC_RELOAD, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0 = toolBarWithRightComponentUIState4;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1 = list5;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2 = bookingDetailsUIState3;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3 = priceDetailsUIState2;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4 = ticketInfoUIState;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5 = imageUIState;
                    sectionDividerColor = ChaloColorToken.SectionDividerColor.f9849a;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6 = sectionDividerColor;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7 = chaloTextStyleHelper7;
                    cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.label = 9;
                    objB4 = stringProvider4.b(StringEnum.TICKET_RECEIPT_NOT_AVAILABLE_TITLE, new Object[0], cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1);
                    if (objB4 != coroutineSingletons) {
                        imageUIState2 = imageUIState;
                        objB5 = objB4;
                        toolBarWithRightComponentUIState7 = toolBarWithRightComponentUIState4;
                        chaloColorToken = sectionDividerColor;
                        list7 = list5;
                        ProductSummaryStatusUiData productSummaryStatusUiData17 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                        toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                        list6 = list7;
                        productSummaryStatusUiData2 = productSummaryStatusUiData17;
                    }
                    return coroutineSingletons;
                }
                list6 = list5;
                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState4;
                productSummaryStatusUiData2 = productSummaryStatusUiData;
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
            case 9:
                chaloTextStyleHelper7 = (ChaloTextStyleHelper) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$7;
                ChaloColorToken chaloColorToken2 = (ChaloColorToken) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$6;
                ImageUIState imageUIState3 = (ImageUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$5;
                ticketInfoUIState = (TicketInfoUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$4;
                priceDetailsUIState2 = (PriceDetailsUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$3;
                bookingDetailsUIState3 = (BookingDetailsUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$2;
                list7 = (List) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$1;
                toolBarWithRightComponentUIState7 = (ToolBarWithRightComponentUIState) cardSummaryUIStateMapperKt$getCardTransactionReceiptSummaryUIState$1.L$0;
                ResultKt.b(objB5);
                chaloColorToken = chaloColorToken2;
                imageUIState2 = imageUIState3;
                almostBlackColor2 = almostBlackColor4;
                ProductSummaryStatusUiData productSummaryStatusUiData18 = new ProductSummaryStatusUiData(imageUIState2, chaloColorToken, ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB5, almostBlackColor2, null, null, null, null, 124), null, null, null, null, WalletConstants.ERROR_CODE_INVALID_PARAMETERS);
                toolBarWithRightComponentUIState6 = toolBarWithRightComponentUIState7;
                list6 = list7;
                productSummaryStatusUiData2 = productSummaryStatusUiData18;
                return new TicketSummarySuccessScreenUIState(toolBarWithRightComponentUIState6, list6, ticketInfoUIState, bookingDetailsUIState3, productSummaryStatusUiData2, priceDetailsUIState2, null, null, null, 3969);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r2 == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        if (r2 == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0134, code lost:
    
        if (r2 == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0180, code lost:
    
        if (r2 == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c1, code lost:
    
        if (r2 == r4) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(app.chalo.data.CardRechargeSummaryData r24, app.chalo.providers.stringprovider.StringProvider r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productsummary.ui.ticket.CardSummaryUIStateMapperKt.e(app.chalo.data.CardRechargeSummaryData, app.chalo.providers.stringprovider.StringProvider, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
