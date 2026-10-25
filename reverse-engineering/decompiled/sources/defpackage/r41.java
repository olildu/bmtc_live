package defpackage;

import androidx.window.layout.SafeWindowLayoutComponentProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r41 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19176a;
    public final /* synthetic */ SafeWindowLayoutComponentProvider b;

    public /* synthetic */ r41(SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider, int i) {
        this.f19176a = i;
        this.b = safeWindowLayoutComponentProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean zIsWindowLayoutProviderValid$lambda$0;
        switch (this.f19176a) {
            case 0:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isWindowLayoutProviderValid$lambda$0(this.b);
                break;
            case 1:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isFoldingFeatureValid$lambda$1(this.b);
                break;
            case 2:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isSupportedWindowFeaturesValid$lambda$5(this.b);
                break;
            case 3:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isDisplayFoldFeatureValid$lambda$4(this.b);
                break;
            case 4:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isGetSupportedWindowFeaturesValid$lambda$6(this.b);
                break;
            case 5:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isMethodWindowLayoutInfoListenerJavaConsumerValid$lambda$2(this.b);
                break;
            default:
                zIsWindowLayoutProviderValid$lambda$0 = SafeWindowLayoutComponentProvider.isMethodWindowLayoutInfoListenerWindowConsumerValid$lambda$3(this.b);
                break;
        }
        return Boolean.valueOf(zIsWindowLayoutProviderValid$lambda$0);
    }
}
