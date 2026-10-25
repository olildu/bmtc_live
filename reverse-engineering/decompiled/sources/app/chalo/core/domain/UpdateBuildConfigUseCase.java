package app.chalo.core.domain;

import androidx.datastore.core.DataStore;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.Environment;
import app.chalo.buildconfig.Platform;
import app.chalo.buildconfig.ProductBrandFlavor;
import app.chalo.buildconfig.ProductFlavor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/domain/UpdateBuildConfigUseCase;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateBuildConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloBuildConfig f2150a;
    public final DataStore b;

    public UpdateBuildConfigUseCase(DataStore dataStore, ChaloBuildConfig platformProvidedConfig) {
        Intrinsics.i(platformProvidedConfig, "platformProvidedConfig");
        this.f2150a = platformProvidedConfig;
        this.b = dataStore;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.core.domain.UpdateBuildConfigUseCase$invoke$1] */
    public final UpdateBuildConfigUseCase$invoke$1 a() {
        final Environment f885a;
        ChaloBuildConfig chaloBuildConfig = this.f2150a;
        if (chaloBuildConfig.getG()) {
            f885a = (Environment) BuildersKt.e(EmptyCoroutineContext.f17583a, new UpdateBuildConfigUseCase$getStoredEnvironment$1(this, null));
            if (f885a == null) {
                f885a = chaloBuildConfig.getF2153a();
            }
        } else {
            f885a = chaloBuildConfig.getF2153a();
        }
        return new ChaloBuildConfig(f885a, this) { // from class: app.chalo.core.domain.UpdateBuildConfigUseCase$invoke$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Environment f2153a;
            public final ProductFlavor b;
            public final ProductBrandFlavor c;
            public final Platform d;
            public final int e;
            public final String f;
            public final boolean g;
            public final String h;
            public final int i;
            public final String j;
            public final String k;
            public final String l;
            public final String m;

            {
                this.f2153a = f885a;
                ChaloBuildConfig chaloBuildConfig2 = this.f2150a;
                this.b = chaloBuildConfig2.getB();
                this.c = chaloBuildConfig2.getC();
                this.d = chaloBuildConfig2.getD();
                this.e = chaloBuildConfig2.getE();
                this.f = chaloBuildConfig2.getF();
                this.g = chaloBuildConfig2.getG();
                this.h = chaloBuildConfig2.getH();
                this.i = chaloBuildConfig2.getI();
                this.j = chaloBuildConfig2.getJ();
                this.k = chaloBuildConfig2.getK();
                this.l = chaloBuildConfig2.getL();
                this.m = chaloBuildConfig2.getM();
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getI() {
                return this.i;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: c, reason: from getter */
            public final ProductBrandFlavor getC() {
                return this.c;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getF() {
                return this.f;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: e, reason: from getter */
            public final int getE() {
                return this.e;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getL() {
                return this.l;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: h, reason: from getter */
            public final Environment getF2153a() {
                return this.f2153a;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getH() {
                return this.h;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: l, reason: from getter */
            public final Platform getD() {
                return this.d;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: m, reason: from getter */
            public final ProductFlavor getB() {
                return this.b;
            }

            @Override // app.chalo.buildconfig.ChaloBuildConfig
            /* JADX INFO: renamed from: n, reason: from getter */
            public final boolean getG() {
                return this.g;
            }
        };
    }
}
