package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.features.language.LanguageFeature;
import app.chalo.livetracking.frameworklivetracking.data.repository.LiveTrackingFrameworkRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/domain/GetChaloSocketConfigUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetChaloSocketConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4324a;
    public final UserProfileDetailsProvider b;
    public final ChaloBuildConfig c;
    public final LanguageFeature d;
    public final LiveTrackingFrameworkRepository e;

    public GetChaloSocketConfigUseCase(CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, ChaloBuildConfig chaloBuildConfig, LanguageFeature languageFeature, LiveTrackingFrameworkRepository liveTrackingFrameworkRepository) {
        this.f4324a = cityProvider;
        this.b = userProfileDetailsProvider;
        this.c = chaloBuildConfig;
        this.d = languageFeature;
        this.e = liveTrackingFrameworkRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r15 == r2) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.domain.GetChaloSocketConfigUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
