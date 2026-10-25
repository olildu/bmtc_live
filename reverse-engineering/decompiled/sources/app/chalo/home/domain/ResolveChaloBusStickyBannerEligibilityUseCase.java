package app.chalo.home.domain;

import app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/domain/ResolveChaloBusStickyBannerEligibilityUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolveChaloBusStickyBannerEligibilityUseCase {
    public static final Set g = ArraysKt.j0(new PremiumReserveTicketStatus[]{PremiumReserveTicketStatus.USED, PremiumReserveTicketStatus.PUNCHED, PremiumReserveTicketStatus.EXPIRED});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f3076a;
    public final UserProfilingHooksRuleEngine b;
    public final PremiumBusUserSurveyPreferenceRepository c;
    public final CrashlyticsLogger d;
    public final PremiumBusRepository e;
    public final CityProvider f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ResolveChaloBusStickyBannerEligibilityUseCase$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ResolveChaloBusStickyBannerEligibilityUseCase(UserProfileDetailsProvider userProfileDetailsProvider, UserProfilingHooksRuleEngine userProfilingHooksRuleEngine, PremiumBusUserSurveyPreferenceRepository premiumBusUserSurveyPreferenceRepository, CrashlyticsLogger crashlyticsLogger, PremiumBusRepository premiumBusRepository, CityProvider cityProvider) {
        this.f3076a = userProfileDetailsProvider;
        this.b = userProfilingHooksRuleEngine;
        this.c = premiumBusUserSurveyPreferenceRepository;
        this.d = crashlyticsLogger;
        this.e = premiumBusRepository;
        this.f = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0085 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #2 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:14:0x002e, B:59:0x00cf, B:61:0x00d4, B:63:0x00da, B:66:0x00e4, B:67:0x00e9, B:69:0x00ef, B:71:0x0101, B:74:0x0106, B:75:0x010a, B:80:0x0110, B:22:0x0041, B:48:0x0099, B:50:0x009f, B:52:0x00a2, B:54:0x00ae, B:56:0x00b2, B:82:0x0115, B:23:0x0045, B:41:0x007d, B:43:0x0085, B:45:0x0088, B:24:0x0049, B:30:0x005c, B:32:0x0060, B:34:0x0063, B:36:0x0069, B:38:0x006c, B:27:0x0050), top: B:87:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0088 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #2 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:14:0x002e, B:59:0x00cf, B:61:0x00d4, B:63:0x00da, B:66:0x00e4, B:67:0x00e9, B:69:0x00ef, B:71:0x0101, B:74:0x0106, B:75:0x010a, B:80:0x0110, B:22:0x0041, B:48:0x0099, B:50:0x009f, B:52:0x00a2, B:54:0x00ae, B:56:0x00b2, B:82:0x0115, B:23:0x0045, B:41:0x007d, B:43:0x0085, B:45:0x0088, B:24:0x0049, B:30:0x005c, B:32:0x0060, B:34:0x0063, B:36:0x0069, B:38:0x006c, B:27:0x0050), top: B:87:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, PHI: r10
      0x0099: PHI (r10v20 java.lang.Object) = (r10v18 java.lang.Object), (r10v1 java.lang.Object) binds: [B:46:0x0096, B:22:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:14:0x002e, B:59:0x00cf, B:61:0x00d4, B:63:0x00da, B:66:0x00e4, B:67:0x00e9, B:69:0x00ef, B:71:0x0101, B:74:0x0106, B:75:0x010a, B:80:0x0110, B:22:0x0041, B:48:0x0099, B:50:0x009f, B:52:0x00a2, B:54:0x00ae, B:56:0x00b2, B:82:0x0115, B:23:0x0045, B:41:0x007d, B:43:0x0085, B:45:0x0088, B:24:0x0049, B:30:0x005c, B:32:0x0060, B:34:0x0063, B:36:0x0069, B:38:0x006c, B:27:0x0050), top: B:87:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x009f A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #2 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:14:0x002e, B:59:0x00cf, B:61:0x00d4, B:63:0x00da, B:66:0x00e4, B:67:0x00e9, B:69:0x00ef, B:71:0x0101, B:74:0x0106, B:75:0x010a, B:80:0x0110, B:22:0x0041, B:48:0x0099, B:50:0x009f, B:52:0x00a2, B:54:0x00ae, B:56:0x00b2, B:82:0x0115, B:23:0x0045, B:41:0x007d, B:43:0x0085, B:45:0x0088, B:24:0x0049, B:30:0x005c, B:32:0x0060, B:34:0x0063, B:36:0x0069, B:38:0x006c, B:27:0x0050), top: B:87:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #2 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:14:0x002e, B:59:0x00cf, B:61:0x00d4, B:63:0x00da, B:66:0x00e4, B:67:0x00e9, B:69:0x00ef, B:71:0x0101, B:74:0x0106, B:75:0x010a, B:80:0x0110, B:22:0x0041, B:48:0x0099, B:50:0x009f, B:52:0x00a2, B:54:0x00ae, B:56:0x00b2, B:82:0x0115, B:23:0x0045, B:41:0x007d, B:43:0x0085, B:45:0x0088, B:24:0x0049, B:30:0x005c, B:32:0x0060, B:34:0x0063, B:36:0x0069, B:38:0x006c, B:27:0x0050), top: B:87:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ae A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #2 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:14:0x002e, B:59:0x00cf, B:61:0x00d4, B:63:0x00da, B:66:0x00e4, B:67:0x00e9, B:69:0x00ef, B:71:0x0101, B:74:0x0106, B:75:0x010a, B:80:0x0110, B:22:0x0041, B:48:0x0099, B:50:0x009f, B:52:0x00a2, B:54:0x00ae, B:56:0x00b2, B:82:0x0115, B:23:0x0045, B:41:0x007d, B:43:0x0085, B:45:0x0088, B:24:0x0049, B:30:0x005c, B:32:0x0060, B:34:0x0063, B:36:0x0069, B:38:0x006c, B:27:0x0050), top: B:87:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cc, code lost:
    
        if (r10 == r1) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.ResolveChaloBusStickyBannerEligibilityUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
