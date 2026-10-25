package app.chalo.plotline;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.network.config.ChaloJson;
import app.chalo.plotline.data.model.ActionType;
import app.chalo.plotline.data.model.CustomActionValue;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.SystemHelper;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/plotline/HandleCustomActionUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HandleCustomActionUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f6835a;
    public final BasicInfoContract b;
    public final UserProfileDetailsProvider c;
    public final CrashlyticsLogger d;
    public final SystemHelper e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6836a;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[ActionType.ADJUST_REFERRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6836a = iArr;
        }
    }

    public HandleCustomActionUseCase(StringProvider stringProvider, BasicInfoContract basicInfoContract, UserProfileDetailsProvider userProfileDetailsProvider, CrashlyticsLogger crashlyticsLogger, SystemHelper systemHelper) {
        this.f6835a = stringProvider;
        this.b = basicInfoContract;
        this.c = userProfileDetailsProvider;
        this.d = crashlyticsLogger;
        this.e = systemHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        HandleCustomActionUseCase$invoke$1 handleCustomActionUseCase$invoke$1;
        CustomActionValue customActionValue;
        if (continuationImpl instanceof HandleCustomActionUseCase$invoke$1) {
            handleCustomActionUseCase$invoke$1 = (HandleCustomActionUseCase$invoke$1) continuationImpl;
            int i = handleCustomActionUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                handleCustomActionUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                handleCustomActionUseCase$invoke$1 = new HandleCustomActionUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            handleCustomActionUseCase$invoke$1 = new HandleCustomActionUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = handleCustomActionUseCase$invoke$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handleCustomActionUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (str != null) {
                try {
                    customActionValue = (CustomActionValue) ChaloJson.b.b(str, CustomActionValue.INSTANCE.serializer());
                } catch (Exception e) {
                    this.d.i(e);
                    customActionValue = null;
                }
                if (customActionValue != null) {
                    if (WhenMappings.f6836a[customActionValue.f6846a.ordinal()] != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str2 = customActionValue.b;
                    String str3 = customActionValue.c;
                    String str4 = customActionValue.d;
                    handleCustomActionUseCase$invoke$1.label = 1;
                    if (b(str2, str3, str4, handleCustomActionUseCase$invoke$1) == obj2) {
                        return obj2;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        HandleCustomActionUseCase$referralInvite$1 handleCustomActionUseCase$referralInvite$1;
        String str4;
        String strN;
        if (continuationImpl instanceof HandleCustomActionUseCase$referralInvite$1) {
            handleCustomActionUseCase$referralInvite$1 = (HandleCustomActionUseCase$referralInvite$1) continuationImpl;
            int i = handleCustomActionUseCase$referralInvite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                handleCustomActionUseCase$referralInvite$1.label = i - Integer.MIN_VALUE;
            } else {
                handleCustomActionUseCase$referralInvite$1 = new HandleCustomActionUseCase$referralInvite$1(this, continuationImpl);
            }
        } else {
            handleCustomActionUseCase$referralInvite$1 = new HandleCustomActionUseCase$referralInvite$1(this, continuationImpl);
        }
        Object objB = handleCustomActionUseCase$referralInvite$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handleCustomActionUseCase$referralInvite$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            UserProfileAppModel userProfileAppModelF = this.c.f();
            if (userProfileAppModelF == null || (str4 = userProfileAppModelF.e) == null) {
                str4 = "";
            }
            String strN2 = vo1.n(str3, "?label=", this.b.getDeviceId());
            if (str4.length() > 0) {
                strN2 = vo1.n(strN2, ",", str4);
            }
            strN = vo1.n(str, strN2, str2);
            handleCustomActionUseCase$referralInvite$1.L$0 = strN;
            handleCustomActionUseCase$referralInvite$1.label = 1;
            objB = this.f6835a.b(StringEnum.INVITE_FRIEND, new Object[0], handleCustomActionUseCase$referralInvite$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strN = (String) handleCustomActionUseCase$referralInvite$1.L$0;
            ResultKt.b(objB);
        }
        this.e.k((String) objB, strN, null);
        return Unit.f17538a;
    }
}
