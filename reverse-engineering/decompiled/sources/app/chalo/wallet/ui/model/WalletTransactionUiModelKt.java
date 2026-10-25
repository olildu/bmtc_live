package app.chalo.wallet.ui.model;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletTransactionUiModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10886a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WalletTransactionType.values().length];
            try {
                iArr[WalletTransactionType.QUICK_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletTransactionType.LOAD_MONEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletTransactionType.CHALO_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10886a = iArr;
            int[] iArr2 = new int[WalletTransactionStatus.values().length];
            try {
                iArr2[WalletTransactionStatus.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WalletTransactionStatus.UNSYNCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletTransactionStatus.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WalletTransactionStatus.REFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[WalletTransactionStatus.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x0236  */
    /* JADX WARN: Code duplicated, block: B:65:0x023c  */
    /* JADX WARN: Code duplicated, block: B:68:0x025c  */
    /* JADX WARN: Code duplicated, block: B:70:0x026a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0289  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final Object a(WalletTransactionAppModel walletTransactionAppModel, StringProvider stringProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, String str, long j, ContinuationImpl continuationImpl) {
        WalletTransactionUiModelKt$toWalletTransactionUiModel$1 walletTransactionUiModelKt$toWalletTransactionUiModel$1;
        String str2;
        Object obj;
        WalletTransactionAppModel walletTransactionAppModel2;
        Object obj2;
        String str3;
        String str4;
        String strA;
        int i;
        Object objB;
        WalletTransactionAppModel walletTransactionAppModel3;
        TimeUtilsContract timeUtilsContract2;
        String str5;
        String str6;
        String str7;
        StringProvider stringProvider2;
        long j2;
        Object objB2;
        String str8;
        WalletTransactionType walletTransactionType;
        String strJ;
        long j3;
        int i2;
        boolean z;
        boolean z2;
        Object objB3;
        String str9;
        long j4;
        String str10;
        String str11;
        String str12;
        int i3;
        String str13;
        boolean z3;
        StringProvider stringProvider3 = stringProvider;
        CurrencyFeature currencyFeature2 = currencyFeature;
        TimeUtilsContract timeUtilsContract3 = timeUtilsContract;
        long j5 = j;
        if (continuationImpl instanceof WalletTransactionUiModelKt$toWalletTransactionUiModel$1) {
            walletTransactionUiModelKt$toWalletTransactionUiModel$1 = (WalletTransactionUiModelKt$toWalletTransactionUiModel$1) continuationImpl;
            int i4 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = i4 - Integer.MIN_VALUE;
            } else {
                walletTransactionUiModelKt$toWalletTransactionUiModel$1 = new WalletTransactionUiModelKt$toWalletTransactionUiModel$1(continuationImpl);
            }
        } else {
            walletTransactionUiModelKt$toWalletTransactionUiModel$1 = new WalletTransactionUiModelKt$toWalletTransactionUiModel$1(continuationImpl);
        }
        Object obj3 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str14 = "";
        switch (walletTransactionUiModelKt$toWalletTransactionUiModel$1.label) {
            case 0:
                ResultKt.b(obj3);
                str2 = walletTransactionAppModel.f11016a;
                int i5 = WhenMappings.f10886a[walletTransactionAppModel.b.ordinal()];
                if (i5 == 1) {
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = currencyFeature2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = timeUtilsContract3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 1;
                    Object objB4 = stringProvider3.b(StringEnum.PAY_FOR_TICKET, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                    if (objB4 != coroutineSingletons) {
                        obj = objB4;
                        walletTransactionAppModel2 = walletTransactionAppModel;
                        str3 = (String) obj;
                        str4 = walletTransactionAppModel2.e;
                        strA = currencyFeature2.a(walletTransactionAppModel2.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        i = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                        if (i == 1) {
                            if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                                objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                                if (objB2 != coroutineSingletons) {
                                    walletTransactionAppModel3 = walletTransactionAppModel2;
                                    timeUtilsContract2 = timeUtilsContract3;
                                    str5 = str4;
                                    long j6 = j5;
                                    str6 = str3;
                                    str7 = str2;
                                    obj3 = objB2;
                                    stringProvider2 = stringProvider3;
                                    j2 = j6;
                                    str8 = (String) obj3;
                                }
                            } else {
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                                objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                                if (objB != coroutineSingletons) {
                                    walletTransactionAppModel3 = walletTransactionAppModel2;
                                    timeUtilsContract2 = timeUtilsContract3;
                                    str5 = str4;
                                    long j7 = j5;
                                    str6 = str3;
                                    str7 = str2;
                                    obj3 = objB;
                                    stringProvider2 = stringProvider3;
                                    j2 = j7;
                                    str8 = (String) obj3;
                                }
                            }
                        } else if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                            objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                            if (objB2 != coroutineSingletons) {
                                walletTransactionAppModel3 = walletTransactionAppModel2;
                                timeUtilsContract2 = timeUtilsContract3;
                                str5 = str4;
                                long j8 = j5;
                                str6 = str3;
                                str7 = str2;
                                obj3 = objB2;
                                stringProvider2 = stringProvider3;
                                j2 = j8;
                                str8 = (String) obj3;
                            }
                        } else {
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                            objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                            if (objB != coroutineSingletons) {
                                walletTransactionAppModel3 = walletTransactionAppModel2;
                                timeUtilsContract2 = timeUtilsContract3;
                                str5 = str4;
                                long j9 = j5;
                                str6 = str3;
                                str7 = str2;
                                obj3 = objB;
                                stringProvider2 = stringProvider3;
                                j2 = j9;
                                str8 = (String) obj3;
                            }
                        }
                        str4 = str5;
                        timeUtilsContract3 = timeUtilsContract2;
                        walletTransactionAppModel2 = walletTransactionAppModel3;
                        long j10 = j2;
                        str3 = str6;
                        stringProvider3 = stringProvider2;
                        str14 = str8;
                        str2 = str7;
                        j5 = j10;
                        long j11 = walletTransactionAppModel2.h;
                        walletTransactionType = walletTransactionAppModel2.b;
                        strJ = timeUtilsContract3.j(j11);
                        j3 = walletTransactionAppModel2.h;
                        int i6 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                        if (i6 != 1) {
                        }
                        StringEnum stringEnum = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                        Long l = new Long(j5);
                        z = true;
                        z2 = false;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                        objB3 = stringProvider3.b(stringEnum, new Object[]{l}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str9 = str2;
                        j4 = j3;
                        str10 = str4;
                        obj3 = objB3;
                        str11 = strJ;
                        str12 = str3;
                        i3 = i2;
                        str13 = strA;
                        String str15 = (String) obj3;
                        if (i3 != 0) {
                            z3 = z;
                        } else {
                            z3 = z2;
                        }
                        return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str15);
                    }
                } else if (i5 == 2) {
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = currencyFeature2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = timeUtilsContract3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 2;
                    Object objB5 = stringProvider3.b(StringEnum.MONEY_ADDED, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                    if (objB5 != coroutineSingletons) {
                        obj2 = objB5;
                        walletTransactionAppModel2 = walletTransactionAppModel;
                        str3 = (String) obj2;
                        str4 = walletTransactionAppModel2.e;
                        strA = currencyFeature2.a(walletTransactionAppModel2.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                        i = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                        if (i == 1) {
                            if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                                objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                                if (objB2 != coroutineSingletons) {
                                    walletTransactionAppModel3 = walletTransactionAppModel2;
                                    timeUtilsContract2 = timeUtilsContract3;
                                    str5 = str4;
                                    long j12 = j5;
                                    str6 = str3;
                                    str7 = str2;
                                    obj3 = objB2;
                                    stringProvider2 = stringProvider3;
                                    j2 = j12;
                                    str8 = (String) obj3;
                                }
                            } else {
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                                objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                                if (objB != coroutineSingletons) {
                                    walletTransactionAppModel3 = walletTransactionAppModel2;
                                    timeUtilsContract2 = timeUtilsContract3;
                                    str5 = str4;
                                    long j13 = j5;
                                    str6 = str3;
                                    str7 = str2;
                                    obj3 = objB;
                                    stringProvider2 = stringProvider3;
                                    j2 = j13;
                                    str8 = (String) obj3;
                                }
                            }
                        } else if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                            objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                            if (objB2 != coroutineSingletons) {
                                walletTransactionAppModel3 = walletTransactionAppModel2;
                                timeUtilsContract2 = timeUtilsContract3;
                                str5 = str4;
                                long j14 = j5;
                                str6 = str3;
                                str7 = str2;
                                obj3 = objB2;
                                stringProvider2 = stringProvider3;
                                j2 = j14;
                                str8 = (String) obj3;
                            }
                        } else {
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                            objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                            if (objB != coroutineSingletons) {
                                walletTransactionAppModel3 = walletTransactionAppModel2;
                                timeUtilsContract2 = timeUtilsContract3;
                                str5 = str4;
                                long j15 = j5;
                                str6 = str3;
                                str7 = str2;
                                obj3 = objB;
                                stringProvider2 = stringProvider3;
                                j2 = j15;
                                str8 = (String) obj3;
                            }
                        }
                        str4 = str5;
                        timeUtilsContract3 = timeUtilsContract2;
                        walletTransactionAppModel2 = walletTransactionAppModel3;
                        long j16 = j2;
                        str3 = str6;
                        stringProvider3 = stringProvider2;
                        str14 = str8;
                        str2 = str7;
                        j5 = j16;
                        long j17 = walletTransactionAppModel2.h;
                        walletTransactionType = walletTransactionAppModel2.b;
                        strJ = timeUtilsContract3.j(j17);
                        j3 = walletTransactionAppModel2.h;
                        int i7 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                        if (i7 != 1) {
                        }
                        StringEnum stringEnum2 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                        Long l2 = new Long(j5);
                        z = true;
                        z2 = false;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                        objB3 = stringProvider3.b(stringEnum2, new Object[]{l2}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str9 = str2;
                        j4 = j3;
                        str10 = str4;
                        obj3 = objB3;
                        str11 = strJ;
                        str12 = str3;
                        i3 = i2;
                        str13 = strA;
                        String str16 = (String) obj3;
                        if (i3 != 0) {
                            z3 = z;
                        } else {
                            z3 = z2;
                        }
                        return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str16);
                    }
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    walletTransactionAppModel2 = walletTransactionAppModel;
                    str3 = str == null ? "" : str;
                    str4 = walletTransactionAppModel2.e;
                    strA = currencyFeature2.a(walletTransactionAppModel2.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                    i = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                    if (i == 1 && i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 5;
                                Object objB6 = stringProvider3.b(StringEnum.RETURNED, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                                if (objB6 != coroutineSingletons) {
                                    walletTransactionAppModel3 = walletTransactionAppModel2;
                                    timeUtilsContract2 = timeUtilsContract3;
                                    str5 = str4;
                                    long j18 = j5;
                                    str6 = str3;
                                    str7 = str2;
                                    obj3 = objB6;
                                    stringProvider2 = stringProvider3;
                                    j2 = j18;
                                    str8 = (String) obj3;
                                    str4 = str5;
                                    timeUtilsContract3 = timeUtilsContract2;
                                    walletTransactionAppModel2 = walletTransactionAppModel3;
                                    long j19 = j2;
                                    str3 = str6;
                                    stringProvider3 = stringProvider2;
                                    str14 = str8;
                                    str2 = str7;
                                    j5 = j19;
                                }
                            } else {
                                if (i != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 6;
                                Object objB7 = stringProvider3.b(StringEnum.FAILED, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                                if (objB7 != coroutineSingletons) {
                                    walletTransactionAppModel3 = walletTransactionAppModel2;
                                    timeUtilsContract2 = timeUtilsContract3;
                                    str5 = str4;
                                    long j20 = j5;
                                    str6 = str3;
                                    str7 = str2;
                                    obj3 = objB7;
                                    stringProvider2 = stringProvider3;
                                    j2 = j20;
                                    str8 = (String) obj3;
                                    str4 = str5;
                                    timeUtilsContract3 = timeUtilsContract2;
                                    walletTransactionAppModel2 = walletTransactionAppModel3;
                                    long j110 = j2;
                                    str3 = str6;
                                    stringProvider3 = stringProvider2;
                                    str14 = str8;
                                    str2 = str7;
                                    j5 = j110;
                                }
                            }
                        }
                        long j111 = walletTransactionAppModel2.h;
                        walletTransactionType = walletTransactionAppModel2.b;
                        strJ = timeUtilsContract3.j(j111);
                        j3 = walletTransactionAppModel2.h;
                        int i8 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                        if (i8 != 1) {
                        }
                        StringEnum stringEnum3 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                        Long l3 = new Long(j5);
                        z = true;
                        z2 = false;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                        objB3 = stringProvider3.b(stringEnum3, new Object[]{l3}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str9 = str2;
                        j4 = j3;
                        str10 = str4;
                        obj3 = objB3;
                        str11 = strJ;
                        str12 = str3;
                        i3 = i2;
                        str13 = strA;
                        String str17 = (String) obj3;
                        if (i3 != 0) {
                            z3 = z;
                        } else {
                            z3 = z2;
                        }
                        return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str17);
                    }
                    if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                        objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB2 != coroutineSingletons) {
                            walletTransactionAppModel3 = walletTransactionAppModel2;
                            timeUtilsContract2 = timeUtilsContract3;
                            str5 = str4;
                            long j112 = j5;
                            str6 = str3;
                            str7 = str2;
                            obj3 = objB2;
                            stringProvider2 = stringProvider3;
                            j2 = j112;
                            str8 = (String) obj3;
                            str4 = str5;
                            timeUtilsContract3 = timeUtilsContract2;
                            walletTransactionAppModel2 = walletTransactionAppModel3;
                            long j113 = j2;
                            str3 = str6;
                            stringProvider3 = stringProvider2;
                            str14 = str8;
                            str2 = str7;
                            j5 = j113;
                            long j114 = walletTransactionAppModel2.h;
                            walletTransactionType = walletTransactionAppModel2.b;
                            strJ = timeUtilsContract3.j(j114);
                            j3 = walletTransactionAppModel2.h;
                            int i9 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                            i2 = ((i9 != 1 || i9 == 2) && walletTransactionType == WalletTransactionType.QUICK_PAY) ? 1 : 0;
                            StringEnum stringEnum4 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                            Long l4 = new Long(j5);
                            z = true;
                            z2 = false;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                            objB3 = stringProvider3.b(stringEnum4, new Object[]{l4}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                            if (objB3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str9 = str2;
                            j4 = j3;
                            str10 = str4;
                            obj3 = objB3;
                            str11 = strJ;
                            str12 = str3;
                            i3 = i2;
                            str13 = strA;
                            String str18 = (String) obj3;
                            if (i3 != 0) {
                                z3 = z;
                            } else {
                                z3 = z2;
                            }
                            return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str18);
                        }
                    } else {
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                        objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB != coroutineSingletons) {
                            walletTransactionAppModel3 = walletTransactionAppModel2;
                            timeUtilsContract2 = timeUtilsContract3;
                            str5 = str4;
                            long j115 = j5;
                            str6 = str3;
                            str7 = str2;
                            obj3 = objB;
                            stringProvider2 = stringProvider3;
                            j2 = j115;
                            str8 = (String) obj3;
                            str4 = str5;
                            timeUtilsContract3 = timeUtilsContract2;
                            walletTransactionAppModel2 = walletTransactionAppModel3;
                            long j116 = j2;
                            str3 = str6;
                            stringProvider3 = stringProvider2;
                            str14 = str8;
                            str2 = str7;
                            j5 = j116;
                            long j117 = walletTransactionAppModel2.h;
                            walletTransactionType = walletTransactionAppModel2.b;
                            strJ = timeUtilsContract3.j(j117);
                            j3 = walletTransactionAppModel2.h;
                            int i10 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                            if (i10 != 1) {
                            }
                            StringEnum stringEnum5 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                            Long l5 = new Long(j5);
                            z = true;
                            z2 = false;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                            walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                            objB3 = stringProvider3.b(stringEnum5, new Object[]{l5}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                            if (objB3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str9 = str2;
                            j4 = j3;
                            str10 = str4;
                            obj3 = objB3;
                            str11 = strJ;
                            str12 = str3;
                            i3 = i2;
                            str13 = strA;
                            String str19 = (String) obj3;
                            if (i3 != 0) {
                                z3 = z;
                            } else {
                                z3 = z2;
                            }
                            return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str19);
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                long j21 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0;
                String str20 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4;
                timeUtilsContract3 = (TimeUtilsContract) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3;
                CurrencyFeature currencyFeature3 = (CurrencyFeature) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2;
                StringProvider stringProvider4 = (StringProvider) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1;
                walletTransactionAppModel2 = (WalletTransactionAppModel) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0;
                ResultKt.b(obj3);
                obj = obj3;
                str2 = str20;
                currencyFeature2 = currencyFeature3;
                stringProvider3 = stringProvider4;
                j5 = j21;
                str3 = (String) obj;
                str4 = walletTransactionAppModel2.e;
                strA = currencyFeature2.a(walletTransactionAppModel2.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                i = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                if (i == 1) {
                    if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                        objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB2 != coroutineSingletons) {
                            walletTransactionAppModel3 = walletTransactionAppModel2;
                            timeUtilsContract2 = timeUtilsContract3;
                            str5 = str4;
                            long j118 = j5;
                            str6 = str3;
                            str7 = str2;
                            obj3 = objB2;
                            stringProvider2 = stringProvider3;
                            j2 = j118;
                            str8 = (String) obj3;
                        }
                    } else {
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                        objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB != coroutineSingletons) {
                            walletTransactionAppModel3 = walletTransactionAppModel2;
                            timeUtilsContract2 = timeUtilsContract3;
                            str5 = str4;
                            long j119 = j5;
                            str6 = str3;
                            str7 = str2;
                            obj3 = objB;
                            stringProvider2 = stringProvider3;
                            j2 = j119;
                            str8 = (String) obj3;
                        }
                    }
                    return coroutineSingletons;
                }
                if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                    objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                    if (objB2 != coroutineSingletons) {
                        walletTransactionAppModel3 = walletTransactionAppModel2;
                        timeUtilsContract2 = timeUtilsContract3;
                        str5 = str4;
                        long j1110 = j5;
                        str6 = str3;
                        str7 = str2;
                        obj3 = objB2;
                        stringProvider2 = stringProvider3;
                        j2 = j1110;
                        str8 = (String) obj3;
                    }
                } else {
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                    objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                    if (objB != coroutineSingletons) {
                        walletTransactionAppModel3 = walletTransactionAppModel2;
                        timeUtilsContract2 = timeUtilsContract3;
                        str5 = str4;
                        long j1111 = j5;
                        str6 = str3;
                        str7 = str2;
                        obj3 = objB;
                        stringProvider2 = stringProvider3;
                        j2 = j1111;
                        str8 = (String) obj3;
                    }
                }
                return coroutineSingletons;
                str4 = str5;
                timeUtilsContract3 = timeUtilsContract2;
                walletTransactionAppModel2 = walletTransactionAppModel3;
                long j1112 = j2;
                str3 = str6;
                stringProvider3 = stringProvider2;
                str14 = str8;
                str2 = str7;
                j5 = j1112;
                long j1113 = walletTransactionAppModel2.h;
                walletTransactionType = walletTransactionAppModel2.b;
                strJ = timeUtilsContract3.j(j1113);
                j3 = walletTransactionAppModel2.h;
                int i11 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                if (i11 != 1) {
                }
                StringEnum stringEnum6 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                Long l6 = new Long(j5);
                z = true;
                z2 = false;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                objB3 = stringProvider3.b(stringEnum6, new Object[]{l6}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str9 = str2;
                j4 = j3;
                str10 = str4;
                obj3 = objB3;
                str11 = strJ;
                str12 = str3;
                i3 = i2;
                str13 = strA;
                String str110 = (String) obj3;
                if (i3 != 0) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str110);
            case 2:
                long j22 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0;
                String str21 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4;
                timeUtilsContract3 = (TimeUtilsContract) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3;
                CurrencyFeature currencyFeature4 = (CurrencyFeature) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2;
                StringProvider stringProvider5 = (StringProvider) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1;
                walletTransactionAppModel2 = (WalletTransactionAppModel) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0;
                ResultKt.b(obj3);
                obj2 = obj3;
                str2 = str21;
                currencyFeature2 = currencyFeature4;
                stringProvider3 = stringProvider5;
                j5 = j22;
                str3 = (String) obj2;
                str4 = walletTransactionAppModel2.e;
                strA = currencyFeature2.a(walletTransactionAppModel2.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
                i = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                if (i == 1) {
                    if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                        objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB2 != coroutineSingletons) {
                            walletTransactionAppModel3 = walletTransactionAppModel2;
                            timeUtilsContract2 = timeUtilsContract3;
                            str5 = str4;
                            long j1114 = j5;
                            str6 = str3;
                            str7 = str2;
                            obj3 = objB2;
                            stringProvider2 = stringProvider3;
                            j2 = j1114;
                            str8 = (String) obj3;
                        }
                    } else {
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                        walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                        objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                        if (objB != coroutineSingletons) {
                            walletTransactionAppModel3 = walletTransactionAppModel2;
                            timeUtilsContract2 = timeUtilsContract3;
                            str5 = str4;
                            long j1115 = j5;
                            str6 = str3;
                            str7 = str2;
                            obj3 = objB;
                            stringProvider2 = stringProvider3;
                            j2 = j1115;
                            str8 = (String) obj3;
                        }
                    }
                    return coroutineSingletons;
                }
                if (walletTransactionAppModel2.b == WalletTransactionType.QUICK_PAY) {
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 3;
                    objB2 = stringProvider3.b(StringEnum.PENDING_CONFIRMATION, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                    if (objB2 != coroutineSingletons) {
                        walletTransactionAppModel3 = walletTransactionAppModel2;
                        timeUtilsContract2 = timeUtilsContract3;
                        str5 = str4;
                        long j1116 = j5;
                        str6 = str3;
                        str7 = str2;
                        obj3 = objB2;
                        stringProvider2 = stringProvider3;
                        j2 = j1116;
                        str8 = (String) obj3;
                    }
                } else {
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = walletTransactionAppModel2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = stringProvider3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = timeUtilsContract3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = str2;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str3;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = str4;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = strA;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j5;
                    walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 4;
                    objB = stringProvider3.b(StringEnum.WALLET_RECHARGE_PAYMENT_PROCESSING, new Object[0], walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                    if (objB != coroutineSingletons) {
                        walletTransactionAppModel3 = walletTransactionAppModel2;
                        timeUtilsContract2 = timeUtilsContract3;
                        str5 = str4;
                        long j1117 = j5;
                        str6 = str3;
                        str7 = str2;
                        obj3 = objB;
                        stringProvider2 = stringProvider3;
                        j2 = j1117;
                        str8 = (String) obj3;
                    }
                }
                return coroutineSingletons;
                str4 = str5;
                timeUtilsContract3 = timeUtilsContract2;
                walletTransactionAppModel2 = walletTransactionAppModel3;
                long j1118 = j2;
                str3 = str6;
                stringProvider3 = stringProvider2;
                str14 = str8;
                str2 = str7;
                j5 = j1118;
                long j1119 = walletTransactionAppModel2.h;
                walletTransactionType = walletTransactionAppModel2.b;
                strJ = timeUtilsContract3.j(j1119);
                j3 = walletTransactionAppModel2.h;
                int i12 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                if (i12 != 1) {
                }
                StringEnum stringEnum7 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                Long l7 = new Long(j5);
                z = true;
                z2 = false;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                objB3 = stringProvider3.b(stringEnum7, new Object[]{l7}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str9 = str2;
                j4 = j3;
                str10 = str4;
                obj3 = objB3;
                str11 = strJ;
                str12 = str3;
                i3 = i2;
                str13 = strA;
                String str111 = (String) obj3;
                if (i3 != 0) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str111);
            case 3:
                j2 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0;
                strA = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6;
                str5 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5;
                str6 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4;
                str7 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3;
                timeUtilsContract2 = (TimeUtilsContract) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2;
                stringProvider2 = (StringProvider) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1;
                walletTransactionAppModel3 = (WalletTransactionAppModel) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0;
                ResultKt.b(obj3);
                str8 = (String) obj3;
                str4 = str5;
                timeUtilsContract3 = timeUtilsContract2;
                walletTransactionAppModel2 = walletTransactionAppModel3;
                long j11110 = j2;
                str3 = str6;
                stringProvider3 = stringProvider2;
                str14 = str8;
                str2 = str7;
                j5 = j11110;
                long j11111 = walletTransactionAppModel2.h;
                walletTransactionType = walletTransactionAppModel2.b;
                strJ = timeUtilsContract3.j(j11111);
                j3 = walletTransactionAppModel2.h;
                int i13 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                if (i13 != 1) {
                }
                StringEnum stringEnum8 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                Long l8 = new Long(j5);
                z = true;
                z2 = false;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                objB3 = stringProvider3.b(stringEnum8, new Object[]{l8}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str9 = str2;
                j4 = j3;
                str10 = str4;
                obj3 = objB3;
                str11 = strJ;
                str12 = str3;
                i3 = i2;
                str13 = strA;
                String str112 = (String) obj3;
                if (i3 != 0) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str112);
            case 4:
                j2 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0;
                strA = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6;
                str5 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5;
                str6 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4;
                str7 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3;
                timeUtilsContract2 = (TimeUtilsContract) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2;
                stringProvider2 = (StringProvider) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1;
                walletTransactionAppModel3 = (WalletTransactionAppModel) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0;
                ResultKt.b(obj3);
                str8 = (String) obj3;
                str4 = str5;
                timeUtilsContract3 = timeUtilsContract2;
                walletTransactionAppModel2 = walletTransactionAppModel3;
                long j11112 = j2;
                str3 = str6;
                stringProvider3 = stringProvider2;
                str14 = str8;
                str2 = str7;
                j5 = j11112;
                long j11113 = walletTransactionAppModel2.h;
                walletTransactionType = walletTransactionAppModel2.b;
                strJ = timeUtilsContract3.j(j11113);
                j3 = walletTransactionAppModel2.h;
                int i14 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                if (i14 != 1) {
                }
                StringEnum stringEnum9 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                Long l9 = new Long(j5);
                z = true;
                z2 = false;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                objB3 = stringProvider3.b(stringEnum9, new Object[]{l9}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str9 = str2;
                j4 = j3;
                str10 = str4;
                obj3 = objB3;
                str11 = strJ;
                str12 = str3;
                i3 = i2;
                str13 = strA;
                String str113 = (String) obj3;
                if (i3 != 0) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str113);
            case 5:
                j2 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0;
                strA = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6;
                str5 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5;
                str6 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4;
                str7 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3;
                timeUtilsContract2 = (TimeUtilsContract) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2;
                stringProvider2 = (StringProvider) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1;
                walletTransactionAppModel3 = (WalletTransactionAppModel) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0;
                ResultKt.b(obj3);
                str8 = (String) obj3;
                str4 = str5;
                timeUtilsContract3 = timeUtilsContract2;
                walletTransactionAppModel2 = walletTransactionAppModel3;
                long j11114 = j2;
                str3 = str6;
                stringProvider3 = stringProvider2;
                str14 = str8;
                str2 = str7;
                j5 = j11114;
                long j11115 = walletTransactionAppModel2.h;
                walletTransactionType = walletTransactionAppModel2.b;
                strJ = timeUtilsContract3.j(j11115);
                j3 = walletTransactionAppModel2.h;
                int i15 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                if (i15 != 1) {
                }
                StringEnum stringEnum10 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                Long l10 = new Long(j5);
                z = true;
                z2 = false;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                objB3 = stringProvider3.b(stringEnum10, new Object[]{l10}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str9 = str2;
                j4 = j3;
                str10 = str4;
                obj3 = objB3;
                str11 = strJ;
                str12 = str3;
                i3 = i2;
                str13 = strA;
                String str114 = (String) obj3;
                if (i3 != 0) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str114);
            case 6:
                j2 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0;
                strA = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6;
                str5 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5;
                str6 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4;
                str7 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3;
                timeUtilsContract2 = (TimeUtilsContract) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2;
                stringProvider2 = (StringProvider) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1;
                walletTransactionAppModel3 = (WalletTransactionAppModel) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0;
                ResultKt.b(obj3);
                str8 = (String) obj3;
                str4 = str5;
                timeUtilsContract3 = timeUtilsContract2;
                walletTransactionAppModel2 = walletTransactionAppModel3;
                long j11116 = j2;
                str3 = str6;
                stringProvider3 = stringProvider2;
                str14 = str8;
                str2 = str7;
                j5 = j11116;
                long j11117 = walletTransactionAppModel2.h;
                walletTransactionType = walletTransactionAppModel2.b;
                strJ = timeUtilsContract3.j(j11117);
                j3 = walletTransactionAppModel2.h;
                int i16 = WhenMappings.b[walletTransactionAppModel2.g.ordinal()];
                if (i16 != 1) {
                }
                StringEnum stringEnum11 = StringEnum.QUICK_PAY_PROCESSING_INFO_TEXT;
                Long l11 = new Long(j5);
                z = true;
                z2 = false;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0 = str2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1 = str3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2 = str4;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3 = strA;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4 = str14;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5 = strJ;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6 = walletTransactionType;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0 = j3;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0 = i2;
                walletTransactionUiModelKt$toWalletTransactionUiModel$1.label = 7;
                objB3 = stringProvider3.b(stringEnum11, new Object[]{l11}, walletTransactionUiModelKt$toWalletTransactionUiModel$1);
                if (objB3 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str9 = str2;
                j4 = j3;
                str10 = str4;
                obj3 = objB3;
                str11 = strJ;
                str12 = str3;
                i3 = i2;
                str13 = strA;
                String str115 = (String) obj3;
                if (i3 != 0) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str115);
            case 7:
                i3 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.I$0;
                long j23 = walletTransactionUiModelKt$toWalletTransactionUiModel$1.J$0;
                WalletTransactionType walletTransactionType2 = (WalletTransactionType) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$6;
                String str22 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$5;
                String str23 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$4;
                String str24 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$3;
                String str25 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$2;
                String str26 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$1;
                str9 = (String) walletTransactionUiModelKt$toWalletTransactionUiModel$1.L$0;
                ResultKt.b(obj3);
                str13 = str24;
                str10 = str25;
                str11 = str22;
                z = true;
                z2 = false;
                j4 = j23;
                walletTransactionType = walletTransactionType2;
                str12 = str26;
                str14 = str23;
                String str116 = (String) obj3;
                if (i3 != 0) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                return new WalletTransactionUiModel(str9, str12, str10, str13, str14, str11, j4, walletTransactionType, z3, str116);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
