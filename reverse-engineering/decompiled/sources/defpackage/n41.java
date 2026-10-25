package defpackage;

import androidx.window.embedding.SafeActivityEmbeddingComponentProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n41 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18452a;
    public final /* synthetic */ SafeActivityEmbeddingComponentProvider b;

    public /* synthetic */ n41(SafeActivityEmbeddingComponentProvider safeActivityEmbeddingComponentProvider, int i) {
        this.f18452a = i;
        this.b = safeActivityEmbeddingComponentProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40;
        switch (this.f18452a) {
            case 0:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40(this.b);
                break;
            case 1:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodPinUnpinTopActivityStackValid$lambda$32(this.b);
                break;
            case 2:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodClearActivityStackAttributesCalculatorValid$lambda$58(this.b);
                break;
            case 3:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodClearEmbeddedActivityWindowInfoCallbackValid$lambda$41(this.b);
                break;
            case 4:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodUpdateActivityStackAttributesValid$lambda$59(this.b);
                break;
            case 5:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetActivityStackAttributesCalculatorValid$lambda$57(this.b);
                break;
            case 6:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodGetEmbeddedActivityWindowInfoValid$lambda$39(this.b);
                break;
            case 7:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodClearSplitInfoCallbackValid$lambda$14(this.b);
                break;
            case 8:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodUpdateSplitAttributesValid$lambda$27(this.b);
                break;
            case 9:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodInvalidateTopVisibleSplitAttributesValid$lambda$26(this.b);
                break;
            case 10:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodIsActivityEmbeddedValid$lambda$2(this.b);
                break;
            case 11:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetSplitInfoCallbackJavaConsumerValid$lambda$3(this.b);
                break;
            case 12:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetSplitInfoCallbackWindowConsumerValid$lambda$13(this.b);
                break;
            case 13:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodGetParentContainerInfoValid$lambda$56(this.b);
                break;
            case 14:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSetEmbeddingRulesValid$lambda$1(this.b);
                break;
            case 15:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodGetActivityStackTokenValid$lambda$54(this.b);
                break;
            case 16:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodSplitAttributesCalculatorValid$lambda$15(this.b);
                break;
            case 17:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodRegisterActivityStackCallbackValid$lambda$30(this.b);
                break;
            case 18:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodUpdateSplitAttributesWithTokenValid$lambda$33(this.b);
                break;
            case 19:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isActivityEmbeddingComponentValid$lambda$0(this.b);
                break;
            default:
                zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40 = SafeActivityEmbeddingComponentProvider.isMethodUnregisterActivityStackCallbackValid$lambda$31(this.b);
                break;
        }
        return Boolean.valueOf(zIsMethodSetEmbeddedActivityWindowInfoCallbackValid$lambda$40);
    }
}
