package app.chalo.validationsdk.blevalidation.domain.validationprocess;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.ChaloWalletOrderIdUtils;
import app.chalo.validationsdk.blevalidation.data.models.api.PremiumBusPunchDataOverBleApiModel;
import app.chalo.validationsdk.blevalidation.data.models.api.TITOTapDataOverBleApiModel;
import app.chalo.validationsdk.blevalidation.data.models.app.ProductValidationDataReceivedOverBle;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/validationprocess/GetProductValidationDataFromDataReceivedOverBleConnectionUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProductValidationDataFromDataReceivedOverBleConnectionUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f10524a;
    public final GetWalletSetupConfigurationUseCase b;
    public final CrashlyticsLogger c;

    public GetProductValidationDataFromDataReceivedOverBleConnectionUseCase(CoroutineContextProvider coroutineContextProvider, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, CrashlyticsLogger crashlyticsLogger) {
        this.f10524a = coroutineContextProvider;
        this.b = getWalletSetupConfigurationUseCase;
        this.c = crashlyticsLogger;
    }

    public static final ProductValidationDataReceivedOverBle a(GetProductValidationDataFromDataReceivedOverBleConnectionUseCase getProductValidationDataFromDataReceivedOverBleConnectionUseCase, PremiumBusPunchDataOverBleApiModel premiumBusPunchDataOverBleApiModel, String str) {
        String str2;
        String str3;
        getProductValidationDataFromDataReceivedOverBleConnectionUseCase.getClass();
        Pair pairE = e(premiumBusPunchDataOverBleApiModel.d);
        if (pairE == null || (str2 = (String) pairE.d()) == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str, "ETIMProductType translation failed");
        }
        Pair pairE2 = e(premiumBusPunchDataOverBleApiModel.d);
        if (pairE2 == null || (str3 = (String) pairE2.e()) == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str, "ETIMProductSubtype translation failed");
        }
        String str4 = premiumBusPunchDataOverBleApiModel.b;
        if (str4 == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str, "tapInPunchTS bookingId null");
        }
        Long l = premiumBusPunchDataOverBleApiModel.e;
        if (l == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str, "punchTsInMillis null");
        }
        long jLongValue = l.longValue();
        String str5 = premiumBusPunchDataOverBleApiModel.f;
        return str5 == null ? new ProductValidationDataReceivedOverBle.InvalidData(str, "endStopId null") : new ProductValidationDataReceivedOverBle.ConductorValidationPunchData(jLongValue, str, str4, str2, str3, str5);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x010f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:71:0x012b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0131  */
    /* JADX WARN: Code duplicated, block: B:75:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    public static final Object b(GetProductValidationDataFromDataReceivedOverBleConnectionUseCase getProductValidationDataFromDataReceivedOverBleConnectionUseCase, TITOTapDataOverBleApiModel tITOTapDataOverBleApiModel, String str, ContinuationImpl continuationImpl) {
        GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1 getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1;
        String str2;
        String str3;
        long jLongValue;
        String strA;
        long jLongValue2;
        String str4;
        String str5;
        String str6;
        long j;
        String str7;
        String str8;
        String str9;
        long j2;
        Long l;
        long jLongValue3;
        String str10;
        String str11;
        String str12;
        Long l2;
        String str13;
        TITOTapDataOverBleApiModel tITOTapDataOverBleApiModel2 = tITOTapDataOverBleApiModel;
        String str14 = str;
        getProductValidationDataFromDataReceivedOverBleConnectionUseCase.getClass();
        if (continuationImpl instanceof GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1) {
            getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1 = (GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1) continuationImpl;
            int i = getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.label = i - Integer.MIN_VALUE;
            } else {
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1 = new GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1(getProductValidationDataFromDataReceivedOverBleConnectionUseCase, continuationImpl);
            }
        } else {
            getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1 = new GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1(getProductValidationDataFromDataReceivedOverBleConnectionUseCase, continuationImpl);
        }
        Object obj = getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Pair pairE = e(tITOTapDataOverBleApiModel2.p);
            if (pairE == null || (str2 = (String) pairE.d()) == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str14, "ETIMProductType translation failed");
            }
            Pair pairE2 = e(tITOTapDataOverBleApiModel2.p);
            if (pairE2 == null || (str3 = (String) pairE2.e()) == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str14, "ETIMProductSubtype translation failed");
            }
            String str15 = tITOTapDataOverBleApiModel2.e;
            Long l3 = tITOTapDataOverBleApiModel2.f;
            jLongValue = l3 != null ? l3.longValue() : -1L;
            if (!str2.equals("quickpay") || !str3.equals("quickpay")) {
                strA = tITOTapDataOverBleApiModel2.d;
                if (strA == null) {
                    return new ProductValidationDataReceivedOverBle.InvalidData(str14, "tapInPunchTS bookingId null");
                }
            } else {
                if (str15 == null || str15.length() <= 0 || jLongValue == -1) {
                    return new ProductValidationDataReceivedOverBle.InvalidData(str14, "walletId or activation exp time missing for qp validation");
                }
                strA = ChaloWalletOrderIdUtils.a(jLongValue, str15);
            }
            if (str2.equals("quickpay") && str3.equals("quickpay")) {
                GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = getProductValidationDataFromDataReceivedOverBleConnectionUseCase.b;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$0 = tITOTapDataOverBleApiModel2;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$1 = str14;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$2 = str2;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$3 = str3;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$4 = strA;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.J$0 = jLongValue;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.label = 1;
                Object objB = getWalletSetupConfigurationUseCase.b(getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str5 = str3;
                obj = objB;
            } else {
                Long l4 = tITOTapDataOverBleApiModel2.c;
                if (l4 == null) {
                    return new ProductValidationDataReceivedOverBle.InvalidData(str14, "activationTsInSec null");
                }
                jLongValue2 = l4.longValue();
                str4 = str3;
            }
            str6 = str2;
            j = jLongValue2;
            str7 = str14;
            str8 = strA;
            str9 = tITOTapDataOverBleApiModel2.b;
            if (str9 != null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "groupNo missing");
            }
            j2 = Long.parseLong(str9);
            l = tITOTapDataOverBleApiModel2.k;
            if (l != null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
            }
            jLongValue3 = l.longValue();
            str10 = tITOTapDataOverBleApiModel2.g;
            if (str10 == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
            }
            str11 = tITOTapDataOverBleApiModel2.h;
            if (str11 == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
            }
            str12 = tITOTapDataOverBleApiModel2.i;
            if (str12 == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
            }
            l2 = tITOTapDataOverBleApiModel2.j;
            if (l2 != null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
            }
            long jLongValue4 = l2.longValue();
            String str16 = tITOTapDataOverBleApiModel2.e;
            Long l5 = tITOTapDataOverBleApiModel2.f;
            long jLongValue5 = l5 != null ? l5.longValue() : -1L;
            str13 = tITOTapDataOverBleApiModel2.n;
            if (str13 == null) {
                str13 = "";
            }
            return new ProductValidationDataReceivedOverBle.TITOTapInData(str7, str8, str6, str4, j2, j, jLongValue3, str10, str11, str12, jLongValue4, str13, str16, new Long(jLongValue5));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.J$0;
        String str17 = (String) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$4;
        str5 = (String) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$3;
        str2 = (String) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$2;
        String str18 = (String) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$1;
        TITOTapDataOverBleApiModel tITOTapDataOverBleApiModel3 = (TITOTapDataOverBleApiModel) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapIn$1.L$0;
        ResultKt.b(obj);
        jLongValue = j3;
        strA = str17;
        tITOTapDataOverBleApiModel2 = tITOTapDataOverBleApiModel3;
        str14 = str18;
        jLongValue2 = (jLongValue - ((WalletSetupConfiguration) obj).f) / ((long) 1000);
        str4 = str5;
        str6 = str2;
        j = jLongValue2;
        str7 = str14;
        str8 = strA;
        str9 = tITOTapDataOverBleApiModel2.b;
        if (str9 != null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "groupNo missing");
        }
        j2 = Long.parseLong(str9);
        l = tITOTapDataOverBleApiModel2.k;
        if (l != null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
        }
        jLongValue3 = l.longValue();
        str10 = tITOTapDataOverBleApiModel2.g;
        if (str10 == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
        }
        str11 = tITOTapDataOverBleApiModel2.h;
        if (str11 == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
        }
        str12 = tITOTapDataOverBleApiModel2.i;
        if (str12 == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
        }
        l2 = tITOTapDataOverBleApiModel2.j;
        if (l2 != null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapInPunchTS null");
        }
        long jLongValue6 = l2.longValue();
        String str19 = tITOTapDataOverBleApiModel2.e;
        Long l6 = tITOTapDataOverBleApiModel2.f;
        if (l6 != null) {
        }
        str13 = tITOTapDataOverBleApiModel2.n;
        if (str13 == null) {
            str13 = "";
        }
        return new ProductValidationDataReceivedOverBle.TITOTapInData(str7, str8, str6, str4, j2, j, jLongValue3, str10, str11, str12, jLongValue6, str13, str19, new Long(jLongValue5));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0130  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code duplicated, block: B:80:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:84:0x017c  */
    public static final Object c(GetProductValidationDataFromDataReceivedOverBleConnectionUseCase getProductValidationDataFromDataReceivedOverBleConnectionUseCase, TITOTapDataOverBleApiModel tITOTapDataOverBleApiModel, String str, ContinuationImpl continuationImpl) {
        GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1 getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1;
        String str2;
        String str3;
        long jLongValue;
        String strA;
        long jLongValue2;
        String str4;
        String str5;
        String str6;
        long j;
        String str7;
        String str8;
        String str9;
        long j2;
        Long l;
        long jLongValue3;
        String str10;
        String str11;
        String str12;
        Long l2;
        TITOTapDataOverBleApiModel tITOTapDataOverBleApiModel2 = tITOTapDataOverBleApiModel;
        String str13 = str;
        getProductValidationDataFromDataReceivedOverBleConnectionUseCase.getClass();
        if (continuationImpl instanceof GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1) {
            getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1 = (GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1) continuationImpl;
            int i = getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.label = i - Integer.MIN_VALUE;
            } else {
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1 = new GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1(getProductValidationDataFromDataReceivedOverBleConnectionUseCase, continuationImpl);
            }
        } else {
            getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1 = new GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1(getProductValidationDataFromDataReceivedOverBleConnectionUseCase, continuationImpl);
        }
        Object obj = getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            Pair pairE = e(tITOTapDataOverBleApiModel2.p);
            if (pairE == null || (str2 = (String) pairE.d()) == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str13, "ETIMProductType translation failed");
            }
            Pair pairE2 = e(tITOTapDataOverBleApiModel2.p);
            if (pairE2 == null || (str3 = (String) pairE2.e()) == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str13, "ETIMProductSubtype translation failed");
            }
            String str14 = tITOTapDataOverBleApiModel2.e;
            Long l3 = tITOTapDataOverBleApiModel2.f;
            jLongValue = l3 != null ? l3.longValue() : -1L;
            if (!str2.equals("quickpay") || !str3.equals("quickpay")) {
                strA = tITOTapDataOverBleApiModel2.d;
                if (strA == null) {
                    return new ProductValidationDataReceivedOverBle.InvalidData(str13, "tapInPunchTS bookingId null");
                }
            } else {
                if (str14 == null || str14.length() <= 0 || jLongValue == -1) {
                    return new ProductValidationDataReceivedOverBle.InvalidData(str13, "walletId or activation exp time missing for qp validation");
                }
                strA = ChaloWalletOrderIdUtils.a(jLongValue, str14);
            }
            if (str2.equals("quickpay") && str3.equals("quickpay")) {
                GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = getProductValidationDataFromDataReceivedOverBleConnectionUseCase.b;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$0 = tITOTapDataOverBleApiModel2;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$1 = str13;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$2 = str2;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$3 = str3;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$4 = strA;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.J$0 = jLongValue;
                getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.label = 1;
                Object objB = getWalletSetupConfigurationUseCase.b(getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str5 = str3;
                obj = objB;
            } else {
                Long l4 = tITOTapDataOverBleApiModel2.c;
                if (l4 == null) {
                    return new ProductValidationDataReceivedOverBle.InvalidData(str13, "activationTsInSec null");
                }
                jLongValue2 = l4.longValue();
                str4 = str3;
            }
            str6 = str2;
            j = jLongValue2;
            str7 = str13;
            str8 = strA;
            str9 = tITOTapDataOverBleApiModel2.b;
            if (str9 != null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapOutPunchTS groupNo");
            }
            j2 = Long.parseLong(str9);
            l = tITOTapDataOverBleApiModel2.k;
            if (l != null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapOutTsInMillis null");
            }
            jLongValue3 = l.longValue();
            str10 = tITOTapDataOverBleApiModel2.g;
            if (str10 == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "routeId null");
            }
            str11 = tITOTapDataOverBleApiModel2.h;
            if (str11 == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "stopId null");
            }
            str12 = tITOTapDataOverBleApiModel2.i;
            if (str12 == null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tripNo null");
            }
            l2 = tITOTapDataOverBleApiModel2.j;
            if (l2 != null) {
                return new ProductValidationDataReceivedOverBle.InvalidData(str7, "waybillNo null");
            }
            long jLongValue4 = l2.longValue();
            String str15 = tITOTapDataOverBleApiModel2.m;
            String str16 = tITOTapDataOverBleApiModel2.n;
            Integer num = tITOTapDataOverBleApiModel2.o;
            String str17 = tITOTapDataOverBleApiModel2.e;
            Long l5 = tITOTapDataOverBleApiModel2.f;
            return new ProductValidationDataReceivedOverBle.TITOTapOutData(str7, str8, str6, str4, j2, j, jLongValue3, str10, str11, str12, jLongValue4, str15, str16, num, str17, new Long(l5 != null ? l5.longValue() : -1L));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.J$0;
        String str18 = (String) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$4;
        str5 = (String) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$3;
        str2 = (String) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$2;
        String str19 = (String) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$1;
        TITOTapDataOverBleApiModel tITOTapDataOverBleApiModel3 = (TITOTapDataOverBleApiModel) getProductValidationDataFromDataReceivedOverBleConnectionUseCase$toProductValidationDataReceivedOverBleForTapOut$1.L$0;
        ResultKt.b(obj);
        jLongValue = j3;
        strA = str18;
        tITOTapDataOverBleApiModel2 = tITOTapDataOverBleApiModel3;
        str13 = str19;
        jLongValue2 = (jLongValue - ((WalletSetupConfiguration) obj).f) / ((long) 1000);
        str4 = str5;
        str6 = str2;
        j = jLongValue2;
        str7 = str13;
        str8 = strA;
        str9 = tITOTapDataOverBleApiModel2.b;
        if (str9 != null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapOutPunchTS groupNo");
        }
        j2 = Long.parseLong(str9);
        l = tITOTapDataOverBleApiModel2.k;
        if (l != null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tapOutTsInMillis null");
        }
        jLongValue3 = l.longValue();
        str10 = tITOTapDataOverBleApiModel2.g;
        if (str10 == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "routeId null");
        }
        str11 = tITOTapDataOverBleApiModel2.h;
        if (str11 == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "stopId null");
        }
        str12 = tITOTapDataOverBleApiModel2.i;
        if (str12 == null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "tripNo null");
        }
        l2 = tITOTapDataOverBleApiModel2.j;
        if (l2 != null) {
            return new ProductValidationDataReceivedOverBle.InvalidData(str7, "waybillNo null");
        }
        long jLongValue5 = l2.longValue();
        String str110 = tITOTapDataOverBleApiModel2.m;
        String str111 = tITOTapDataOverBleApiModel2.n;
        Integer num2 = tITOTapDataOverBleApiModel2.o;
        String str112 = tITOTapDataOverBleApiModel2.e;
        Long l6 = tITOTapDataOverBleApiModel2.f;
        return new ProductValidationDataReceivedOverBle.TITOTapOutData(str7, str8, str6, str4, j2, j, jLongValue3, str10, str11, str12, jLongValue5, str110, str111, num2, str112, new Long(l6 != null ? l6.longValue() : -1L));
    }

    public static Pair e(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return new Pair("quickpay", "quickpay");
                }
                return null;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                if (str.equals("1")) {
                    return new Pair("singleJourneyTicket", "singleJourneyTicket");
                }
                return null;
            case 50:
                if (str.equals(ExifInterface.GPS_MEASUREMENT_2D)) {
                    return new Pair("superPass", "magicPass");
                }
                return null;
            case 51:
            case 52:
            case 53:
            case 54:
            default:
                return null;
            case 55:
                if (str.equals("7")) {
                    return new Pair("superPass", "rideBasedPass");
                }
                return null;
            case 56:
                if (str.equals("8")) {
                    return new Pair("mobileTicket", "instantTicket");
                }
                return null;
            case 57:
                if (str.equals("9")) {
                    return new Pair("mobileTicket", "premiumReserveTicket");
                }
                return null;
        }
    }

    public final Object d(byte[] bArr, Continuation continuation) {
        return BuildersKt.g(this.f10524a.getDefault(), new GetProductValidationDataFromDataReceivedOverBleConnectionUseCase$invoke$2(StringsKt.p(bArr), this, null), continuation);
    }
}
