package app.chalo.compose.resources;

import androidx.compose.runtime.ProvidableCompositionLocal;
import app.chalo.providers.stringprovider.StringProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProvidableCompositionLocal providableCompositionLocal = StringResourcesHelperKt.f1912a;
        return (StringProvider) StringResourcesHelper.f1910a.getValue();
    }
}
