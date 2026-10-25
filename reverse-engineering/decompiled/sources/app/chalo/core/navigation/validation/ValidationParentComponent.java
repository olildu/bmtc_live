package app.chalo.core.navigation.validation;

import app.chalo.core.component.AppComponentFactory;
import app.chalo.navigation.child.ChildComponent;
import app.chalo.navigation.parent.DefaultParentComponent;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent;
import com.arkivanov.decompose.ComponentContext;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/core/navigation/validation/ValidationParentComponent;", "Lapp/chalo/navigation/parent/DefaultParentComponent;", "Lapp/chalo/scenes/args/ValidationArgs;", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild;", "ValidationChild", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidationParentComponent extends DefaultParentComponent<ValidationArgs, ValidationChild> {
    public final ComponentContext d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild;", "Lapp/chalo/navigation/child/ChildComponent;", "BLEValidation", "QRValidation", "QRScanner", "MultiProductValidation", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild$BLEValidation;", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild$MultiProductValidation;", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild$QRScanner;", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild$QRValidation;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ValidationChild implements ChildComponent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild$BLEValidation;", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BLEValidation extends ValidationChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BleValidationFragmentComponent f2289a;

            public BLEValidation(BleValidationFragmentComponent bleValidationFragmentComponent) {
                this.f2289a = bleValidationFragmentComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2289a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BLEValidation) && Intrinsics.d(this.f2289a, ((BLEValidation) obj).f2289a);
            }

            public final int hashCode() {
                return this.f2289a.hashCode();
            }

            public final String toString() {
                return "BLEValidation(component=" + this.f2289a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild$MultiProductValidation;", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MultiProductValidation extends ValidationChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MultiProductValidationComponent f2290a;

            public MultiProductValidation(MultiProductValidationComponent multiProductValidationComponent) {
                this.f2290a = multiProductValidationComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2290a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MultiProductValidation) && Intrinsics.d(this.f2290a, ((MultiProductValidation) obj).f2290a);
            }

            public final int hashCode() {
                return this.f2290a.hashCode();
            }

            public final String toString() {
                return "MultiProductValidation(component=" + this.f2290a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild$QRScanner;", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QRScanner extends ValidationChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final QRScannerValidationComponent f2291a;

            public QRScanner(QRScannerValidationComponent qRScannerValidationComponent) {
                this.f2291a = qRScannerValidationComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2291a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof QRScanner) && Intrinsics.d(this.f2291a, ((QRScanner) obj).f2291a);
            }

            public final int hashCode() {
                return this.f2291a.hashCode();
            }

            public final String toString() {
                return "QRScanner(component=" + this.f2291a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild$QRValidation;", "Lapp/chalo/core/navigation/validation/ValidationParentComponent$ValidationChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QRValidation extends ValidationChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final QRValidationComponent f2292a;

            public QRValidation(QRValidationComponent qRValidationComponent) {
                this.f2292a = qRValidationComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2292a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof QRValidation) && Intrinsics.d(this.f2292a, ((QRValidation) obj).f2292a);
            }

            public final int hashCode() {
                return this.f2292a.hashCode();
            }

            public final String toString() {
                return "QRValidation(component=" + this.f2292a + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationParentComponent(ValidationArgs args, ComponentContext componentContext) {
        super(args, componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.d = componentContext;
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent, app.chalo.navigation.parent.ParentComponent
    public final boolean Y(SceneArgs args) {
        Intrinsics.i(args, "args");
        return args instanceof ValidationArgs;
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final KSerializer a() {
        return ValidationArgs.INSTANCE.serializer();
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final ChildComponent m(SceneArgs sceneArgs, ComponentContext componentContext) {
        ValidationArgs args = (ValidationArgs) sceneArgs;
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        boolean z = args instanceof ValidationArgs.BleValidationScreenArgs;
        AppComponentFactory appComponentFactory = AppComponentFactory.f2029a;
        if (z) {
            return new ValidationChild.BLEValidation((BleValidationFragmentComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        if (args instanceof ValidationArgs.QrValidationScreenArgs) {
            return new ValidationChild.QRValidation((QRValidationComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        if (args instanceof ValidationArgs.QrScannerValidationArgs) {
            return new ValidationChild.QRScanner((QRScannerValidationComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        if (args instanceof ValidationArgs.MultiProductValidation) {
            return new ValidationChild.MultiProductValidation((MultiProductValidationComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
