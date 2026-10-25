package app.chalo.wallet.ui.transactionsummary.model;

import androidx.browser.customtabs.CustomTabsCallback;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.wallet.data.mapper.WalletTransactionQuickPayLoadMoneyStatusMapperKt;
import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.wallet.data.model.ChaloPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.appmodel.ChaloPayResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.LoadMoneyAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletTransactionSummaryUiModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WalletTransactionStatus.values().length];
            try {
                iArr[WalletTransactionStatus.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletTransactionStatus.UNSYNCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(QuickPayAppModel quickPayAppModel, StringProvider stringProvider, ProductValidationData productValidationData, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, ContinuationImpl continuationImpl) {
        WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2 walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2;
        StringProvider stringProvider2;
        TimeUtilsContract timeUtilsContract2;
        String str;
        String strJ;
        String str2;
        String str3;
        QuickPayAppModel quickPayAppModel2;
        int i;
        String str4;
        int i2;
        WalletTransactionStatusForIcon walletTransactionStatusForIcon;
        boolean z;
        QuickPayAppModel quickPayAppModel3 = quickPayAppModel;
        if (continuationImpl instanceof WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2) {
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2 = (WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2) continuationImpl;
            int i3 = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.label = i3 - Integer.MIN_VALUE;
            } else {
                walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2 = new WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2(continuationImpl);
            }
        } else {
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2 = new WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2(continuationImpl);
        }
        Object obj = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            String strA = currencyFeature.a(quickPayAppModel3.h, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$0 = quickPayAppModel3;
            stringProvider2 = stringProvider;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$1 = stringProvider2;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$2 = strA;
            timeUtilsContract2 = timeUtilsContract;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$3 = timeUtilsContract2;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.label = 1;
            Object objX = productValidationData.x(walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2);
            if (objX != obj2) {
                str = strA;
                obj = objX;
            }
            return obj2;
        }
        if (i4 == 1) {
            TimeUtilsContract timeUtilsContract3 = (TimeUtilsContract) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$3;
            String str5 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$2;
            StringProvider stringProvider3 = (StringProvider) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$1;
            QuickPayAppModel quickPayAppModel4 = (QuickPayAppModel) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$0;
            ResultKt.b(obj);
            str = str5;
            stringProvider2 = stringProvider3;
            timeUtilsContract2 = timeUtilsContract3;
            quickPayAppModel3 = quickPayAppModel4;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.I$0;
            String str6 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$5;
            String str7 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$4;
            str2 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$3;
            strJ = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$2;
            str = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$1;
            quickPayAppModel2 = (QuickPayAppModel) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$0;
            ResultKt.b(obj);
            str3 = str6;
            str4 = str7;
        }
        String str8 = str;
        String str9 = strJ;
        String str10 = str2;
        String str11 = (String) obj;
        WalletTransactionType walletTransactionType = WalletTransactionType.QUICK_PAY;
        QuickPayOrderStatus quickPayOrderStatus = quickPayAppModel2.f10918a;
        Intrinsics.i(quickPayOrderStatus, "<this>");
        i2 = WalletTransactionQuickPayLoadMoneyStatusMapperKt.WhenMappings.b[quickPayOrderStatus.ordinal()];
        if (i2 != 1) {
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.PENDING;
        } else if (i2 != 2) {
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.SUCCESS;
        } else {
            if (i2 == 3) {
                throw new NoWhenBranchMatchedException();
            }
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.FAILED;
        }
        WalletTransactionStatusForIcon walletTransactionStatusForIcon2 = walletTransactionStatusForIcon;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        return new WalletTransactionSummaryUiModel(str8, str9, str10, str4, str3, z, str11, walletTransactionType, walletTransactionStatusForIcon2);
        strJ = timeUtilsContract2.j(((Number) obj).longValue());
        str2 = quickPayAppModel3.i;
        String str12 = quickPayAppModel3.b;
        QuickPayOrderStatus quickPayOrderStatus2 = quickPayAppModel3.f10918a;
        int i5 = quickPayOrderStatus2 == QuickPayOrderStatus.PENDING ? 1 : 0;
        walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$0 = quickPayAppModel3;
        walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$1 = str;
        walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$2 = strJ;
        walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$3 = str2;
        walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$4 = str12;
        str3 = "";
        walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.L$5 = "";
        walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.I$0 = i5;
        walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2.label = 2;
        Object objA = WalletTransactionQuickPayLoadMoneyStatusMapperKt.a(quickPayOrderStatus2, stringProvider2, walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$2);
        if (objA != obj2) {
            quickPayAppModel2 = quickPayAppModel3;
            i = i5;
            str4 = str12;
            obj = objA;
            String str13 = str;
            String str14 = strJ;
            String str15 = str2;
            String str16 = (String) obj;
            WalletTransactionType walletTransactionType2 = WalletTransactionType.QUICK_PAY;
            QuickPayOrderStatus quickPayOrderStatus3 = quickPayAppModel2.f10918a;
            Intrinsics.i(quickPayOrderStatus3, "<this>");
            i2 = WalletTransactionQuickPayLoadMoneyStatusMapperKt.WhenMappings.b[quickPayOrderStatus3.ordinal()];
            if (i2 != 1) {
                walletTransactionStatusForIcon = WalletTransactionStatusForIcon.PENDING;
            } else if (i2 != 2) {
                walletTransactionStatusForIcon = WalletTransactionStatusForIcon.SUCCESS;
            } else {
                if (i2 == 3) {
                    throw new NoWhenBranchMatchedException();
                }
                walletTransactionStatusForIcon = WalletTransactionStatusForIcon.FAILED;
            }
            WalletTransactionStatusForIcon walletTransactionStatusForIcon3 = walletTransactionStatusForIcon;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            return new WalletTransactionSummaryUiModel(str13, str14, str15, str4, str3, z, str16, walletTransactionType2, walletTransactionStatusForIcon3);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object b(ChaloPayResponseAppModel chaloPayResponseAppModel, StringProvider stringProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, ContinuationImpl continuationImpl) {
        WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4 walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4;
        String str;
        String str2;
        Object objB;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        WalletTransactionStatusForIcon walletTransactionStatusForIcon;
        ChaloPayResponseAppModel chaloPayResponseAppModel2 = chaloPayResponseAppModel;
        if (continuationImpl instanceof WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4) {
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4 = (WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4) continuationImpl;
            int i2 = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.label = i2 - Integer.MIN_VALUE;
            } else {
                walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4 = new WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4(continuationImpl);
            }
        } else {
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4 = new WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4(continuationImpl);
        }
        Object obj = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            String strA = currencyFeature.a(chaloPayResponseAppModel2.b, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            String strJ = timeUtilsContract.j(chaloPayResponseAppModel2.d);
            str = chaloPayResponseAppModel2.f11002a;
            str2 = chaloPayResponseAppModel2.c;
            String str7 = chaloPayResponseAppModel2.g;
            if (str7 == null) {
                str7 = "";
            }
            ChaloPayOrderStatus chaloPayOrderStatus = chaloPayResponseAppModel2.e;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$0 = chaloPayResponseAppModel2;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$1 = strA;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$2 = strJ;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$3 = str;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$4 = str2;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$5 = "";
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$6 = str7;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.I$0 = 0;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.label = 1;
            int i4 = WalletTransactionQuickPayLoadMoneyStatusMapperKt.WhenMappings.d[chaloPayOrderStatus.ordinal()];
            if (i4 == 1) {
                objB = stringProvider.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4);
            } else if (i4 == 2) {
                objB = stringProvider.b(StringEnum.SUCCESS, new Object[0], walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4);
            } else if (i4 == 3) {
                objB = stringProvider.b(StringEnum.FAILED, new Object[0], walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4);
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                objB = stringProvider.b(StringEnum.RETURNED, new Object[0], walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4);
            }
            if (objB == obj2) {
                return obj2;
            }
            str3 = strJ;
            str4 = strA;
            str5 = str7;
            str6 = "";
            obj = objB;
            i = 0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.I$0;
            String str8 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$6;
            String str9 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$5;
            str2 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$4;
            str = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$3;
            String str10 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$2;
            String str11 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$1;
            ChaloPayResponseAppModel chaloPayResponseAppModel3 = (ChaloPayResponseAppModel) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$4.L$0;
            ResultKt.b(obj);
            str3 = str10;
            str4 = str11;
            str5 = str8;
            str6 = str9;
            i = i5;
            chaloPayResponseAppModel2 = chaloPayResponseAppModel3;
        }
        String str12 = str2;
        String str13 = str;
        String str14 = (String) obj;
        WalletTransactionType walletTransactionType = WalletTransactionType.CHALO_PAY;
        ChaloPayOrderStatus chaloPayOrderStatus2 = chaloPayResponseAppModel2.e;
        Intrinsics.i(chaloPayOrderStatus2, "<this>");
        int i6 = WalletTransactionQuickPayLoadMoneyStatusMapperKt.WhenMappings.d[chaloPayOrderStatus2.ordinal()];
        if (i6 == 1) {
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.PENDING;
        } else if (i6 == 2) {
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.SUCCESS;
        } else {
            if (i6 != 3 && i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.FAILED;
        }
        return new WalletTransactionSummaryUiModel(str4, str3, str13, str12, str6, str5, i != 0, str14, walletTransactionType, walletTransactionStatusForIcon);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object c(LoadMoneyAppModel loadMoneyAppModel, StringProvider stringProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, ContinuationImpl continuationImpl) {
        WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3 walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3;
        String strA;
        String strJ;
        String str;
        Object objB;
        String str2;
        String str3;
        int i;
        WalletTransactionStatusForIcon walletTransactionStatusForIcon;
        LoadMoneyAppModel loadMoneyAppModel2 = loadMoneyAppModel;
        if (continuationImpl instanceof WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3) {
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3 = (WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3) continuationImpl;
            int i2 = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.label = i2 - Integer.MIN_VALUE;
            } else {
                walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3 = new WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3(continuationImpl);
            }
        } else {
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3 = new WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3(continuationImpl);
        }
        Object obj = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            strA = currencyFeature.a(loadMoneyAppModel2.b, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            strJ = timeUtilsContract.j(loadMoneyAppModel2.c);
            str = loadMoneyAppModel2.f11004a;
            String str4 = loadMoneyAppModel2.d;
            String str5 = loadMoneyAppModel2.f;
            if (str5 == null) {
                str5 = CustomTabsCallback.ONLINE_EXTRAS_KEY;
            }
            LoadMoneyOrderStatus loadMoneyOrderStatus = loadMoneyAppModel2.e;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$0 = loadMoneyAppModel2;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$1 = strA;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$2 = strJ;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$3 = str;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$4 = str4;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$5 = str5;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.I$0 = 0;
            walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.label = 1;
            int i4 = WalletTransactionQuickPayLoadMoneyStatusMapperKt.WhenMappings.c[loadMoneyOrderStatus.ordinal()];
            if (i4 == 1) {
                objB = stringProvider.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3);
            } else if (i4 == 2) {
                objB = stringProvider.b(StringEnum.SUCCESS, new Object[0], walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3);
            } else if (i4 == 3) {
                objB = stringProvider.b(StringEnum.FAILED, new Object[0], walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3);
            } else {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                objB = stringProvider.b(StringEnum.RETURNED, new Object[0], walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3);
            }
            if (objB == obj2) {
                return obj2;
            }
            str2 = str4;
            str3 = str5;
            obj = objB;
            i = 0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.I$0;
            String str6 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$5;
            String str7 = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$4;
            str = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$3;
            strJ = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$2;
            strA = (String) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$1;
            LoadMoneyAppModel loadMoneyAppModel3 = (LoadMoneyAppModel) walletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$3.L$0;
            ResultKt.b(obj);
            str3 = str6;
            str2 = str7;
            i = i5;
            loadMoneyAppModel2 = loadMoneyAppModel3;
        }
        String str8 = str;
        String str9 = strJ;
        String str10 = (String) obj;
        WalletTransactionType walletTransactionType = WalletTransactionType.LOAD_MONEY;
        LoadMoneyOrderStatus loadMoneyOrderStatus2 = loadMoneyAppModel2.e;
        Intrinsics.i(loadMoneyOrderStatus2, "<this>");
        int i6 = WalletTransactionQuickPayLoadMoneyStatusMapperKt.WhenMappings.c[loadMoneyOrderStatus2.ordinal()];
        if (i6 == 1) {
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.PENDING;
        } else if (i6 == 2) {
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.SUCCESS;
        } else {
            if (i6 != 3 && i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.FAILED;
        }
        return new WalletTransactionSummaryUiModel(strA, str9, str8, str2, str3, i != 0, str10, walletTransactionType, walletTransactionStatusForIcon);
    }
}
