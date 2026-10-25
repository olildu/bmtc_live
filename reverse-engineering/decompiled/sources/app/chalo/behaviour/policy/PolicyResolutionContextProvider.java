package app.chalo.behaviour.policy;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.providers.cityprovider.CityProvider;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/PolicyResolutionContextProvider;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PolicyResolutionContextProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1020a;
    public final ChaloBuildConfig b;
    public final CityProvider c;

    public PolicyResolutionContextProvider(String str, ChaloBuildConfig chaloBuildConfig, CityProvider cityProvider) {
        this.f1020a = str;
        this.b = chaloBuildConfig;
        this.c = cityProvider;
    }

    public final PolicyResolutionContext a() {
        String lowerCase;
        String strH = this.c.h();
        if (strH != null) {
            lowerCase = strH.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        String str = lowerCase;
        ChaloBuildConfig chaloBuildConfig = this.b;
        return new PolicyResolutionContext(this.f1020a, str, chaloBuildConfig.m(), chaloBuildConfig.h(), chaloBuildConfig.e());
    }
}
