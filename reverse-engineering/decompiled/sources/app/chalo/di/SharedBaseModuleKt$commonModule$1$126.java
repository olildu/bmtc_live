package app.chalo.di;

import app.chalo.behaviour.policy.BrandId;
import app.chalo.buildconfig.ChaloBuildConfig;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SharedBaseModuleKt$commonModule$1$126 implements Function2<Scope, ParametersHolder, BrandId> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SharedBaseModuleKt$commonModule$1$126 f2478a = new SharedBaseModuleKt$commonModule$1$126();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope scope = (Scope) obj;
        String value = ((ChaloBuildConfig) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ChaloBuildConfig.class), null, null)).getJ();
        Intrinsics.i(value, "value");
        return new BrandId(value);
    }
}
