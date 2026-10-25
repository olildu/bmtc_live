package app.chalo.providers;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ChaloBuildConfigKt;
import app.chalo.buildconfig.Environment;
import app.chalo.extensions.StringExtsKt;
import app.chalo.network.ChaloUrlProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import com.adjust.sdk.AdjustConfig;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/providers/ChaloUrlProviderImpl;", "Lapp/chalo/network/ChaloUrlProvider;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloUrlProviderImpl implements ChaloUrlProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f8832a;
    public final Environment b;
    public String c;
    public String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/providers/ChaloUrlProviderImpl$Companion;", "", "", "TAG", "Ljava/lang/String;", "SUB_DOMAIN", "DOMAIN", "CHALO_BASE_URL_FORMAT", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8833a;

        static {
            int[] iArr = new int[Environment.values().length];
            try {
                iArr[Environment.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Environment.DEVELOPMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Environment.PREPROD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8833a = iArr;
        }
    }

    public ChaloUrlProviderImpl(ChaloBuildConfig chaloBuildConfig, CityProvider cityProvider) {
        this.f8832a = cityProvider;
        this.b = chaloBuildConfig.getF2153a();
        k();
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final void a() {
        k();
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String b() {
        String str;
        Environment environment = this.b;
        Intrinsics.i(environment, "<this>");
        int i = ChaloBuildConfigKt.WhenMappings.f1168a[environment.ordinal()];
        if (i == 1 || i == 2) {
            str = AdjustConfig.ENVIRONMENT_PRODUCTION;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "preprod";
        }
        String strR = StringsKt.R("https://env.domain", "env", str);
        String str2 = this.d;
        if (str2 != null) {
            return StringsKt.R(strR, "domain", str2).concat("/vasudha");
        }
        Intrinsics.q("_hostDomain");
        throw null;
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String c() {
        String str;
        Environment environment = this.b;
        Intrinsics.i(environment, "<this>");
        int i = ChaloBuildConfigKt.WhenMappings.f1168a[environment.ordinal()];
        if (i == 1) {
            str = "cash";
        } else if (i == 2) {
            str = "devcash";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "preprod-cash";
        }
        String strR = StringsKt.R("https://env.domain", "env", str);
        String str2 = this.d;
        if (str2 != null) {
            return StringsKt.R(strR, "domain", str2);
        }
        Intrinsics.q("_hostDomain");
        throw null;
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String d() {
        String str = this.c;
        if (str != null) {
            return vo1.A(str, "/chaukidar/v1/logout");
        }
        Intrinsics.q("_baseUrl");
        throw null;
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String e() {
        int i = WhenMappings.f8833a[this.b.ordinal()];
        if (i == 1) {
            String str = this.c;
            if (str != null) {
                return vo1.A(str, "/scheduler_v4/v4/liveFeed");
            }
            Intrinsics.q("_baseUrl");
            throw null;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = this.c;
        if (str2 != null) {
            return vo1.A(str2, ":8080/scheduler_v4/v4/liveFeed");
        }
        Intrinsics.q("_baseUrl");
        throw null;
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String f() {
        return StringsKt.R(StringsKt.R("https://env.domain", "env", ChaloBuildConfigKt.a(this.b)), "domain", "zophop.com");
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String g() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        Intrinsics.q("_baseUrl");
        throw null;
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String h() {
        String strR = StringsKt.R("https://env.domain", "env", "api");
        String str = this.d;
        if (str != null) {
            return StringsKt.R(strR, "domain", str);
        }
        Intrinsics.q("_hostDomain");
        throw null;
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String i() {
        String str;
        Environment environment = this.b;
        Intrinsics.i(environment, "<this>");
        int i = ChaloBuildConfigKt.WhenMappings.f1168a[environment.ordinal()];
        if (i == 1) {
            str = "geoquery";
        } else if (i == 2) {
            str = "devgeoquery";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "preprod-geoquery";
        }
        String strR = StringsKt.R("https://env.domain", "env", str);
        String str2 = this.d;
        if (str2 != null) {
            return StringsKt.R(strR, "domain", str2);
        }
        Intrinsics.q("_hostDomain");
        throw null;
    }

    @Override // app.chalo.network.ChaloUrlProvider
    public final String j() {
        String str = this.c;
        if (str != null) {
            return vo1.A(str, "/chaukidar/v1/refreshTokens");
        }
        Intrinsics.q("_baseUrl");
        throw null;
    }

    public final void k() {
        CityProvider cityProvider = this.f8832a;
        String strB = "zophop.com";
        if (CityProviderKt.c(cityProvider)) {
            CityAppModel cityAppModel = (CityAppModel) cityProvider.getE().getValue();
            strB = StringExtsKt.b(cityAppModel != null ? cityAppModel.b : null, "zophop.com");
        }
        String str = this.d;
        if (str != null && str.equalsIgnoreCase(strB)) {
            return;
        }
        this.d = strB;
        String strR = StringsKt.R("https://env.domain", "env", ChaloBuildConfigKt.a(this.b));
        String str2 = this.d;
        if (str2 != null) {
            this.c = StringsKt.R(strR, "domain", str2);
        } else {
            Intrinsics.q("_hostDomain");
            throw null;
        }
    }
}
