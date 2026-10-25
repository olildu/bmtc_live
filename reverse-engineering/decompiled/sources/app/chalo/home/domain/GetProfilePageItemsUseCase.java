package app.chalo.home.domain;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.extensions.UserProfileDetailsProviderExtKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.home.ui.profile.ProfilePageDisplayItemData;
import app.chalo.homescreen.data.model.app.ProfilePageFeature;
import app.chalo.homescreen.data.model.app.ProfilePageItemDisplayType;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestrator;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import defpackage.hq0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/domain/GetProfilePageItemsUseCase;", "", "PlotlineWidgetMetaData", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetProfilePageItemsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchWalletBalanceUseCase f3046a;
    public final UserProfileDetailsProvider b;
    public final CurrencyFeature c;
    public final StringProvider d;
    public final HomeScreenAnalyticsHelper e;
    public final WalletResolver f;
    public final UserProfilingHooksOrchestrator g;
    public final JuspayControllerProvider h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/GetProfilePageItemsUseCase$PlotlineWidgetMetaData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlotlineWidgetMetaData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3047a;
        public final String b;

        public PlotlineWidgetMetaData(int i, String plotlineId) {
            Intrinsics.i(plotlineId, "plotlineId");
            this.f3047a = i;
            this.b = plotlineId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlotlineWidgetMetaData)) {
                return false;
            }
            PlotlineWidgetMetaData plotlineWidgetMetaData = (PlotlineWidgetMetaData) obj;
            return this.f3047a == plotlineWidgetMetaData.f3047a && Intrinsics.d(this.b, plotlineWidgetMetaData.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f3047a * 31);
        }

        public final String toString() {
            return hq0.d(this.f3047a, "PlotlineWidgetMetaData(index=", ", plotlineId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3048a;

        static {
            int[] iArr = new int[ProfilePageFeature.values().length];
            try {
                iArr[ProfilePageFeature.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfilePageFeature.ACCOUNT_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfilePageFeature.CHALO_WALLET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfilePageFeature.TICKETS_PASSES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfilePageFeature.SAVED_PLACES_AND_RIDES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProfilePageFeature.BUS_STOPS_NEAR_ME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProfilePageFeature.CHANGE_LANGUAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProfilePageFeature.SOS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProfilePageFeature.ELECTRICITY_BILL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProfilePageFeature.CUSTOMER_SUPPORT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProfilePageFeature.USER_CONSENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProfilePageFeature.PLOTLINE_WIDGET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProfilePageFeature.MANAGE_TRAVEL_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ProfilePageFeature.TERMS_CONDITIONS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ProfilePageFeature.CHANGE_ENVIRONMENT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ProfilePageFeature.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ProfilePageFeature.MANAGE_CHALO_UPI.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f3048a = iArr;
        }
    }

    public GetProfilePageItemsUseCase(FetchWalletBalanceUseCase fetchWalletBalanceUseCase, UserProfileDetailsProvider userProfileDetailsProvider, CurrencyFeature currencyFeature, StringProvider stringProvider, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, WalletResolver walletResolver, UserProfilingHooksOrchestrator userProfilingHooksOrchestrator, JuspayControllerProvider juspayControllerProvider) {
        this.f3046a = fetchWalletBalanceUseCase;
        this.b = userProfileDetailsProvider;
        this.c = currencyFeature;
        this.d = stringProvider;
        this.e = homeScreenAnalyticsHelper;
        this.f = walletResolver;
        this.g = userProfilingHooksOrchestrator;
        this.h = juspayControllerProvider;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca A[PHI: r1 r4
      0x00ca: PHI (r1v14 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:30:0x00c7, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]
      0x00ca: PHI (r4v8 app.chalo.homescreen.data.model.app.ProfilePageItemDisplayType) = 
      (r4v7 app.chalo.homescreen.data.model.app.ProfilePageItemDisplayType)
      (r4v17 app.chalo.homescreen.data.model.app.ProfilePageItemDisplayType)
     binds: [B:30:0x00c7, B:17:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(ProfilePageItemDisplayType profilePageItemDisplayType, ContinuationImpl continuationImpl) {
        GetProfilePageItemsUseCase$buildProfileFeatureType$1 getProfilePageItemsUseCase$buildProfileFeatureType$1;
        ProfilePageItemDisplayType profilePageItemDisplayType2;
        Object objA;
        boolean z;
        ProfilePageItemDisplayType profilePageItemDisplayType3;
        boolean z2;
        String str;
        String str2;
        Gender gender;
        ProfileDrawerCardData profileDrawerCardData;
        String str3;
        String str4;
        Object objB;
        String str5;
        ProfilePageItemDisplayType profilePageItemDisplayType4;
        if (continuationImpl instanceof GetProfilePageItemsUseCase$buildProfileFeatureType$1) {
            getProfilePageItemsUseCase$buildProfileFeatureType$1 = (GetProfilePageItemsUseCase$buildProfileFeatureType$1) continuationImpl;
            int i = getProfilePageItemsUseCase$buildProfileFeatureType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProfilePageItemsUseCase$buildProfileFeatureType$1.label = i - Integer.MIN_VALUE;
            } else {
                getProfilePageItemsUseCase$buildProfileFeatureType$1 = new GetProfilePageItemsUseCase$buildProfileFeatureType$1(this, continuationImpl);
            }
        } else {
            getProfilePageItemsUseCase$buildProfileFeatureType$1 = new GetProfilePageItemsUseCase$buildProfileFeatureType$1(this, continuationImpl);
        }
        Object objB2 = getProfilePageItemsUseCase$buildProfileFeatureType$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProfilePageItemsUseCase$buildProfileFeatureType$1.label;
        StringProvider stringProvider = this.d;
        if (i2 == 0) {
            ResultKt.b(objB2);
            profilePageItemDisplayType2 = profilePageItemDisplayType;
            getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0 = profilePageItemDisplayType2;
            getProfilePageItemsUseCase$buildProfileFeatureType$1.label = 1;
            objA = this.g.a(getProfilePageItemsUseCase$buildProfileFeatureType$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ProfilePageItemDisplayType profilePageItemDisplayType5 = (ProfilePageItemDisplayType) getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0;
            ResultKt.b(objB2);
            objA = objB2;
            profilePageItemDisplayType2 = profilePageItemDisplayType5;
        } else {
            if (i2 == 2) {
                boolean z3 = getProfilePageItemsUseCase$buildProfileFeatureType$1.Z$0;
                ProfilePageItemDisplayType profilePageItemDisplayType6 = (ProfilePageItemDisplayType) getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0;
                ResultKt.b(objB2);
                z = z3;
                profilePageItemDisplayType3 = profilePageItemDisplayType6;
                ProfileDrawerCardData profileDrawerCardData2 = (ProfileDrawerCardData) objB2;
                z2 = profileDrawerCardData2.f3592a;
                String str6 = profileDrawerCardData2.b;
                str = profileDrawerCardData2.c;
                str2 = profileDrawerCardData2.d;
                gender = profileDrawerCardData2.e;
                boolean z4 = profileDrawerCardData2.f;
                int i3 = profileDrawerCardData2.h;
                int i4 = profileDrawerCardData2.i;
                Intrinsics.i(gender, "gender");
                profileDrawerCardData = new ProfileDrawerCardData(z2, str6, str, str2, gender, z4, z, i3, i4);
                if (!z2) {
                    if (str == null) {
                        str = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str.length() == 0) {
                        str3 = str2;
                    } else {
                        str3 = str;
                    }
                    if (str.length() <= 0) {
                        str2 = null;
                    }
                    return new ProfilePageDisplayItemData(str3, str2, GenderKt.b(gender, IconType.IC_PROFILE), 0.0f, null, ProfilePageFeature.PROFILE, profilePageItemDisplayType3, profileDrawerCardData, 24);
                }
                getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0 = profilePageItemDisplayType3;
                getProfilePageItemsUseCase$buildProfileFeatureType$1.label = 3;
                objB2 = stringProvider.b(StringEnum.SIGN_IN, new Object[0], getProfilePageItemsUseCase$buildProfileFeatureType$1);
                if (objB2 != coroutineSingletons) {
                    str4 = (String) objB2;
                    getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0 = profilePageItemDisplayType3;
                    getProfilePageItemsUseCase$buildProfileFeatureType$1.L$1 = str4;
                    getProfilePageItemsUseCase$buildProfileFeatureType$1.label = 4;
                    objB = stringProvider.b(StringEnum.FOR_PERSONALISED_EXPERIENCE, new Object[0], getProfilePageItemsUseCase$buildProfileFeatureType$1);
                    if (objB != coroutineSingletons) {
                        str5 = str4;
                        objB2 = objB;
                        profilePageItemDisplayType4 = profilePageItemDisplayType3;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                profilePageItemDisplayType3 = (ProfilePageItemDisplayType) getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0;
                ResultKt.b(objB2);
                str4 = (String) objB2;
                getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0 = profilePageItemDisplayType3;
                getProfilePageItemsUseCase$buildProfileFeatureType$1.L$1 = str4;
                getProfilePageItemsUseCase$buildProfileFeatureType$1.label = 4;
                objB = stringProvider.b(StringEnum.FOR_PERSONALISED_EXPERIENCE, new Object[0], getProfilePageItemsUseCase$buildProfileFeatureType$1);
                if (objB != coroutineSingletons) {
                    str5 = str4;
                    objB2 = objB;
                    profilePageItemDisplayType4 = profilePageItemDisplayType3;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = (String) getProfilePageItemsUseCase$buildProfileFeatureType$1.L$1;
            ProfilePageItemDisplayType profilePageItemDisplayType7 = (ProfilePageItemDisplayType) getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0;
            ResultKt.b(objB2);
            profilePageItemDisplayType4 = profilePageItemDisplayType7;
        }
        return new ProfilePageDisplayItemData(str5, (String) objB2, IconType.IC_PROFILE, 0.0f, null, ProfilePageFeature.PROFILE, profilePageItemDisplayType4, new ProfileDrawerCardData(false, (String) null, (String) null, (String) null, (Gender) null, false, 0, 0, TypedValues.PositionType.TYPE_POSITION_TYPE), 24);
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0 = profilePageItemDisplayType2;
        getProfilePageItemsUseCase$buildProfileFeatureType$1.Z$0 = zBooleanValue;
        getProfilePageItemsUseCase$buildProfileFeatureType$1.label = 2;
        Object objA2 = UserProfileDetailsProviderExtKt.a(this.b, getProfilePageItemsUseCase$buildProfileFeatureType$1);
        if (objA2 != coroutineSingletons) {
            z = zBooleanValue;
            profilePageItemDisplayType3 = profilePageItemDisplayType2;
            objB2 = objA2;
            ProfileDrawerCardData profileDrawerCardData3 = (ProfileDrawerCardData) objB2;
            z2 = profileDrawerCardData3.f3592a;
            String str7 = profileDrawerCardData3.b;
            str = profileDrawerCardData3.c;
            str2 = profileDrawerCardData3.d;
            gender = profileDrawerCardData3.e;
            boolean z5 = profileDrawerCardData3.f;
            int i5 = profileDrawerCardData3.h;
            int i6 = profileDrawerCardData3.i;
            Intrinsics.i(gender, "gender");
            profileDrawerCardData = new ProfileDrawerCardData(z2, str7, str, str2, gender, z5, z, i5, i6);
            if (!z2) {
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (str.length() == 0) {
                    str3 = str2;
                } else {
                    str3 = str;
                }
                if (str.length() <= 0) {
                    str2 = null;
                }
                return new ProfilePageDisplayItemData(str3, str2, GenderKt.b(gender, IconType.IC_PROFILE), 0.0f, null, ProfilePageFeature.PROFILE, profilePageItemDisplayType3, profileDrawerCardData, 24);
            }
            getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0 = profilePageItemDisplayType3;
            getProfilePageItemsUseCase$buildProfileFeatureType$1.label = 3;
            objB2 = stringProvider.b(StringEnum.SIGN_IN, new Object[0], getProfilePageItemsUseCase$buildProfileFeatureType$1);
            if (objB2 != coroutineSingletons) {
                str4 = (String) objB2;
                getProfilePageItemsUseCase$buildProfileFeatureType$1.L$0 = profilePageItemDisplayType3;
                getProfilePageItemsUseCase$buildProfileFeatureType$1.L$1 = str4;
                getProfilePageItemsUseCase$buildProfileFeatureType$1.label = 4;
                objB = stringProvider.b(StringEnum.FOR_PERSONALISED_EXPERIENCE, new Object[0], getProfilePageItemsUseCase$buildProfileFeatureType$1);
                if (objB != coroutineSingletons) {
                    str5 = str4;
                    objB2 = objB;
                    profilePageItemDisplayType4 = profilePageItemDisplayType3;
                    return new ProfilePageDisplayItemData(str5, (String) objB2, IconType.IC_PROFILE, 0.0f, null, ProfilePageFeature.PROFILE, profilePageItemDisplayType4, new ProfileDrawerCardData(false, (String) null, (String) null, (String) null, (Gender) null, false, 0, 0, TypedValues.PositionType.TYPE_POSITION_TYPE), 24);
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        GetProfilePageItemsUseCase$getWalletBalanceText$1 getProfilePageItemsUseCase$getWalletBalanceText$1;
        if (continuationImpl instanceof GetProfilePageItemsUseCase$getWalletBalanceText$1) {
            getProfilePageItemsUseCase$getWalletBalanceText$1 = (GetProfilePageItemsUseCase$getWalletBalanceText$1) continuationImpl;
            int i = getProfilePageItemsUseCase$getWalletBalanceText$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getProfilePageItemsUseCase$getWalletBalanceText$1.label = i - Integer.MIN_VALUE;
            } else {
                getProfilePageItemsUseCase$getWalletBalanceText$1 = new GetProfilePageItemsUseCase$getWalletBalanceText$1(this, continuationImpl);
            }
        } else {
            getProfilePageItemsUseCase$getWalletBalanceText$1 = new GetProfilePageItemsUseCase$getWalletBalanceText$1(this, continuationImpl);
        }
        Object objB = getProfilePageItemsUseCase$getWalletBalanceText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getProfilePageItemsUseCase$getWalletBalanceText$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            getProfilePageItemsUseCase$getWalletBalanceText$1.J$0 = j;
            getProfilePageItemsUseCase$getWalletBalanceText$1.label = 1;
            objB = this.d.b(StringEnum.BALANCE, new Object[0], getProfilePageItemsUseCase$getWalletBalanceText$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = getProfilePageItemsUseCase$getWalletBalanceText$1.J$0;
            ResultKt.b(objB);
        }
        return vo1.n((String) objB, ": ", this.c.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x052c  */
    /* JADX WARN: Code duplicated, block: B:40:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:97:0x04fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r3v29, types: [T, app.chalo.home.domain.GetProfilePageItemsUseCase$PlotlineWidgetMetaData] */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x047c -> B:89:0x047e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x048a -> B:90:0x0487). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x04fc -> B:102:0x0540). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable c(java.util.List r39, kotlin.coroutines.jvm.internal.ContinuationImpl r40) {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetProfilePageItemsUseCase.c(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }
}
