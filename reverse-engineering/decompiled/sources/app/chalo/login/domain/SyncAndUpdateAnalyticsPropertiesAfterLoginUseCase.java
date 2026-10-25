package app.chalo.login.domain;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.features.fcmtoken.FcmTokenFeature;
import app.chalo.features.freshchat.FreshchatUserInteractionContract;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FcmTokenFeature f5250a;
    public final AnalyticsContract b;
    public final FreshchatUserInteractionContract c;
    public final ThoughtNudgeContract d;
    public final WalletSyncHelper e;
    public final ProductsSyncContract f;
    public final UserProfileDetailsProvider g;
    public final TimeUtilsContract h;
    public final UserProfilingHooksRuleEngine i;

    public SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase(FcmTokenFeature fcmTokenFeature, AnalyticsContract analyticsContract, FreshchatUserInteractionContract freshchatUserInteractionContract, ThoughtNudgeContract thoughtNudgeContract, WalletSyncHelper walletSyncHelper, ProductsSyncContract productsSyncContract, UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract, UserProfilingHooksRuleEngine userProfilingHooksRuleEngine) {
        this.f5250a = fcmTokenFeature;
        this.b = analyticsContract;
        this.c = freshchatUserInteractionContract;
        this.d = thoughtNudgeContract;
        this.e = walletSyncHelper;
        this.f = productsSyncContract;
        this.g = userProfileDetailsProvider;
        this.h = timeUtilsContract;
        this.i = userProfilingHooksRuleEngine;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
    
        if (r18.e.b(r2) == r3) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.domain.SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
