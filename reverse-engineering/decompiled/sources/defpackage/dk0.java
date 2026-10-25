package defpackage;

import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.validationsdk.blevalidation.config.MultiProductValidationConfig;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationConfig;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15471a;
    public final /* synthetic */ MultiProductValidationComponent b;

    public /* synthetic */ dk0(MultiProductValidationComponent multiProductValidationComponent, int i) {
        this.f15471a = i;
        this.b = multiProductValidationComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15471a) {
            case 0:
                ChaloNavigationManagerKt.e(this.b.q, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
                return Unit.f17538a;
            case 1:
                return this.b.M0().getD().g();
            case 2:
                return this.b.M0().getD().h();
            case 3:
                MultiProductValidationComponent multiProductValidationComponent = this.b;
                ProductValidationConfig productValidationConfigA = multiProductValidationComponent.m.a(multiProductValidationComponent.k.b.b);
                MultiProductValidationConfig multiProductValidationConfig = productValidationConfigA instanceof MultiProductValidationConfig ? (MultiProductValidationConfig) productValidationConfigA : null;
                if (multiProductValidationConfig != null) {
                    return multiProductValidationConfig;
                }
                throw new IllegalStateException("Multi-product validation requires a group validation config");
            case 4:
                ChaloNavigationManagerKt.c(this.b.q);
                return Unit.f17538a;
            case 5:
                ChaloNavigationManagerKt.e(this.b.q, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
                return Unit.f17538a;
            default:
                this.b.O0(MultiProductValidationIntent.BackPressedIntent.f10692a);
                return Unit.f17538a;
        }
    }
}
