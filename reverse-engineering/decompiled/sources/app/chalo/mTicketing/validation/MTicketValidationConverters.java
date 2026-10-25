package app.chalo.mTicketing.validation;

import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketConfiguration;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.models.userprofile.UserProfile;
import app.chalo.providers.UserProfileDetailsProvider;
import defpackage.gd0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketValidationConverters;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketValidationConverters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MTicketUtilsHelper f5396a;
    public final UserProfileDetailsProvider b;

    public MTicketValidationConverters(MTicketUtilsHelper mTicketUtilsHelper, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f5396a = mTicketUtilsHelper;
        this.b = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(MTicket mTicket, ContinuationImpl continuationImpl) {
        MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1 mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1;
        Object objE;
        String str;
        String str2;
        String str3;
        String str4;
        MTicket mTicket2;
        String str5;
        String str6;
        String str7;
        String str8;
        long j;
        MTicket mTicket3;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        UserProfile userProfile;
        MTicketUserDetailsForProducts mTicketUserDetailsForProducts;
        MTicket mTicket4 = mTicket;
        if (continuationImpl instanceof MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1) {
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1 = (MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1) continuationImpl;
            int i = mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1 = new MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1(this, continuationImpl);
            }
        } else {
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1 = new MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1(this, continuationImpl);
        }
        Object obj = mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.label;
        MTicketUtilsHelper mTicketUtilsHelper = this.f5396a;
        if (i2 == 0) {
            ResultKt.b(obj);
            String str17 = mTicket4.f5615a;
            if (str17 == null) {
                str17 = "";
            }
            String str18 = mTicket4.z;
            if (str18 == null) {
                str18 = "";
            }
            String str19 = mTicket4.p;
            if (str19 == null) {
                str19 = "";
            }
            String str20 = mTicket4.q;
            if (str20 == null) {
                str20 = "";
            }
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$0 = mTicket4;
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$1 = mTicket4;
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$2 = str18;
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$3 = str17;
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$4 = str19;
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$5 = str20;
            mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.label = 1;
            objE = mTicketUtilsHelper.e(mTicket4, mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1);
            if (objE != coroutineSingletons) {
                str = str18;
                str2 = str19;
                str3 = str17;
                str4 = str20;
                mTicket2 = mTicket4;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str21 = (String) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$5;
            str2 = (String) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$4;
            String str22 = (String) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$3;
            String str23 = (String) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$2;
            mTicket2 = (MTicket) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$1;
            MTicket mTicket5 = (MTicket) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$0;
            ResultKt.b(obj);
            str4 = str21;
            mTicket4 = mTicket5;
            str = str23;
            str3 = str22;
            objE = obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.J$0;
            String str24 = (String) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$5;
            String str25 = (String) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$4;
            String str26 = (String) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$3;
            String str27 = (String) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$2;
            mTicket2 = (MTicket) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$1;
            mTicket3 = (MTicket) mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$0;
            ResultKt.b(obj);
            str5 = str24;
            j = j2;
            str6 = str25;
            str7 = str26;
            str8 = str27;
        }
        long jLongValue = ((Number) obj).longValue();
        Intrinsics.i(mTicket2, "mTicket");
        int i3 = (int) (mTicketUtilsHelper.i(mTicket2) * 100.0d);
        str9 = mTicket2.f5615a;
        if (str9 == null) {
            str10 = "";
        } else {
            str10 = str9;
        }
        str11 = mTicket2.C;
        if (str11 == null) {
            str12 = "";
        } else {
            str12 = str11;
        }
        str13 = mTicket2.D;
        if (str13 == null) {
            str14 = "";
        } else {
            str14 = str13;
        }
        str15 = mTicket2.B;
        if (str15 == null) {
            str16 = "";
        } else {
            str16 = str15;
        }
        userProfile = mTicket2.o;
        if (userProfile != null) {
            mTicketUserDetailsForProducts = new MTicketUserDetailsForProducts(userProfile, this.b);
        } else {
            mTicketUserDetailsForProducts = null;
        }
        MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$2 mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$2 = new MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$2(this, mTicket2, null);
        MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$3 mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$3 = new MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$3(this, mTicket2, null);
        MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$4 mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$4 = new MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$4(this, mTicket2, null);
        RouteStopsInfo routeStopsInfo = mTicket3.f;
        Long l = mTicket2.n;
        new Long(jLongValue);
        return new MTicketProductValidationModel(str7, str8, str6, str5, j, i3, str10, str12, str14, str16, l, mTicketUserDetailsForProducts, mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$2, mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$3, mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$4, routeStopsInfo, new gd0(mTicket2, 10));
        long jLongValue2 = ((Number) objE).longValue();
        MTicketConfiguration mTicketConfiguration = mTicket4.r;
        mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$0 = mTicket4;
        mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$1 = mTicket2;
        mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$2 = str;
        mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$3 = str3;
        mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$4 = str2;
        mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.L$5 = str4;
        mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.J$0 = jLongValue2;
        mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1.label = 2;
        Object objC = mTicketUtilsHelper.c(mTicketConfiguration, mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$1);
        if (objC != coroutineSingletons) {
            str5 = str4;
            obj = objC;
            str6 = str2;
            str7 = str3;
            str8 = str;
            j = jLongValue2;
            mTicket3 = mTicket4;
            long jLongValue3 = ((Number) obj).longValue();
            Intrinsics.i(mTicket2, "mTicket");
            int i4 = (int) (mTicketUtilsHelper.i(mTicket2) * 100.0d);
            str9 = mTicket2.f5615a;
            if (str9 == null) {
                str10 = "";
            } else {
                str10 = str9;
            }
            str11 = mTicket2.C;
            if (str11 == null) {
                str12 = "";
            } else {
                str12 = str11;
            }
            str13 = mTicket2.D;
            if (str13 == null) {
                str14 = "";
            } else {
                str14 = str13;
            }
            str15 = mTicket2.B;
            if (str15 == null) {
                str16 = "";
            } else {
                str16 = str15;
            }
            userProfile = mTicket2.o;
            if (userProfile != null) {
                mTicketUserDetailsForProducts = new MTicketUserDetailsForProducts(userProfile, this.b);
            } else {
                mTicketUserDetailsForProducts = null;
            }
            MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$2 mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$5 = new MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$2(this, mTicket2, null);
            MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$3 mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$6 = new MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$3(this, mTicket2, null);
            MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$4 mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$7 = new MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$4(this, mTicket2, null);
            RouteStopsInfo routeStopsInfo2 = mTicket3.f;
            Long l2 = mTicket2.n;
            new Long(jLongValue3);
            return new MTicketProductValidationModel(str7, str8, str6, str5, j, i4, str10, str12, str14, str16, l2, mTicketUserDetailsForProducts, mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$5, mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$6, mTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$7, routeStopsInfo2, new gd0(mTicket2, 10));
        }
        return coroutineSingletons;
    }

    public final MTicketReceiptData b(MTicketTripReceipt receipt, MTicket mTicket) {
        Intrinsics.i(receipt, "receipt");
        if (mTicket == null) {
            return null;
        }
        RouteStopsInfo routeStopsInfo = mTicket.f;
        return new MTicketReceiptData(receipt.f5623a, receipt.c, (long) (this.f5396a.i(mTicket) * 100.0d), receipt.d, receipt.e, routeStopsInfo.d, routeStopsInfo.f, routeStopsInfo.b, MapsKt.d(), receipt.b, routeStopsInfo.e);
    }
}
