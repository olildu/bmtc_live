package app.chalo.features.thoughtnudge;

import android.content.Context;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.constants.Source;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import app.chalo.userprofile.UserProfileAppModel;
import com.thoughtnudge.sdk.ThoughtNudge;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/thoughtnudge/ThoughtNudgeContractImpl;", "Lapp/chalo/thoughtnudge/ThoughtNudgeContract;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThoughtNudgeContractImpl implements ThoughtNudgeContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2766a;
    public final ChaloBuildConfig b;
    public final UserProfileDetailsProvider c;
    public final AnalyticsContract d;
    public final SdkIntegrationPolicyManager e;

    public ThoughtNudgeContractImpl(Context context, ChaloBuildConfig chaloBuildConfig, UserProfileDetailsProvider userProfileDetailsProvider, AnalyticsContract analyticsContract, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        this.f2766a = context;
        this.b = chaloBuildConfig;
        this.c = userProfileDetailsProvider;
        this.d = analyticsContract;
        this.e = sdkIntegrationPolicyManager;
    }

    @Override // app.chalo.thoughtnudge.ThoughtNudgeContract
    public final void a(String userId) {
        Object objA;
        Intrinsics.i(userId, "userId");
        if (this.e.f1078a.c) {
            try {
                ThoughtNudge.identify(userId);
                objA = Unit.f17538a;
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Throwable thA = Result.a(objA);
            if (thA != null) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "";
                }
                d("thought Nudge identify error", message);
            }
            if (objA instanceof Result.Failure) {
                return;
            }
            AnalyticsContractImplKt.b(this.d, "thought Nudge identify success", Source.USECASE, null, false, 28);
        }
    }

    @Override // app.chalo.thoughtnudge.ThoughtNudgeContract
    public final void b() {
        Object objA;
        if (this.e.f1078a.c) {
            try {
                ThoughtNudge.logout();
                objA = Unit.f17538a;
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Throwable thA = Result.a(objA);
            if (thA != null) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "";
                }
                d("thought Nudge logout error", message);
            }
            if (objA instanceof Result.Failure) {
                return;
            }
            AnalyticsContractImplKt.b(this.d, "thought Nudge logout success", Source.USECASE, null, false, 28);
        }
    }

    @Override // app.chalo.thoughtnudge.ThoughtNudgeContract
    public final Pair c() {
        if (this.e.f1078a.c) {
            return ThoughtNudge.consumePendingDeepLink();
        }
        return null;
    }

    public final void d(String str, String str2) {
        AnalyticsContractImplKt.b(this.d, str, Source.USECASE, vo1.s("attribute error reason", str2), false, 24);
    }

    @Override // app.chalo.thoughtnudge.ThoughtNudgeContract
    public final void initialize() {
        Object objA;
        UserProfileAppModel userProfileAppModelF;
        if (this.e.f1078a.c) {
            ChaloBuildConfig chaloBuildConfig = this.b;
            String m = chaloBuildConfig.getM();
            if (StringsKt.F(m)) {
                return;
            }
            try {
                ThoughtNudge.init(this.f2766a, m, chaloBuildConfig.getG() ? ThoughtNudge.Environment.DEVELOPMENT : ThoughtNudge.Environment.PRODUCTION);
                objA = Unit.f17538a;
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Throwable thA = Result.a(objA);
            if (thA != null) {
                String message = thA.getMessage();
                if (message == null) {
                    message = "";
                }
                d("thought Nudge initialization error", message);
            }
            boolean z = objA instanceof Result.Failure;
            if (!z) {
                AnalyticsContractImplKt.b(this.d, "thought Nudge initialization success", Source.USECASE, null, false, 28);
            }
            if (z || (userProfileAppModelF = this.c.f()) == null) {
                return;
            }
            a(userProfileAppModelF.i);
        }
    }
}
