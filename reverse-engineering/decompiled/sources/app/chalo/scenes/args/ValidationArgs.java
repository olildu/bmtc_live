package app.chalo.scenes.args;

import app.chalo.models.validation.BleValidationArgs;
import app.chalo.scenes.ChaloScenes;
import defpackage.yn1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/scenes/args/ParentArgs;", "Companion", "BleValidationScreenArgs", "QrValidationScreenArgs", "QrScannerValidationArgs", "MultiProductValidation", "Lapp/chalo/scenes/args/ValidationArgs$BleValidationScreenArgs;", "Lapp/chalo/scenes/args/ValidationArgs$MultiProductValidation;", "Lapp/chalo/scenes/args/ValidationArgs$QrScannerValidationArgs;", "Lapp/chalo/scenes/args/ValidationArgs$QrValidationScreenArgs;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ValidationArgs extends SceneArgs implements ParentArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(4));
    public final BleValidationArgs b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$BleValidationScreenArgs;", "Lapp/chalo/scenes/args/ValidationArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class BleValidationScreenArgs extends ValidationArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final BleValidationArgs d;
        public final boolean e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$BleValidationScreenArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/ValidationArgs$BleValidationScreenArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<BleValidationScreenArgs> serializer() {
                return ValidationArgs$BleValidationScreenArgs$$serializer.f9340a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BleValidationScreenArgs(int i, BleValidationArgs bleValidationArgs, BleValidationArgs bleValidationArgs2, boolean z) {
            super(bleValidationArgs);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(ValidationArgs$BleValidationScreenArgs$$serializer.f9340a.getDescriptor(), i, 3);
                throw null;
            }
            this.d = bleValidationArgs2;
            if ((i & 4) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.BleValidation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BleValidationScreenArgs)) {
                return false;
            }
            BleValidationScreenArgs bleValidationScreenArgs = (BleValidationScreenArgs) obj;
            return Intrinsics.d(this.d, bleValidationScreenArgs.d) && this.e == bleValidationScreenArgs.e;
        }

        public final int hashCode() {
            return (this.d.hashCode() * 31) + (this.e ? 1231 : 1237);
        }

        public final String toString() {
            return "BleValidationScreenArgs(_validationArgs=" + this.d + ", isQRFirstBleEnabled=" + this.e + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BleValidationScreenArgs(BleValidationArgs _validationArgs, boolean z) {
            super(_validationArgs, 0);
            Intrinsics.i(_validationArgs, "_validationArgs");
            this.d = _validationArgs;
            this.e = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/ValidationArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ValidationArgs> serializer() {
            return (KSerializer) ValidationArgs.c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$MultiProductValidation;", "Lapp/chalo/scenes/args/ValidationArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MultiProductValidation extends ValidationArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final BleValidationArgs d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$MultiProductValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/ValidationArgs$MultiProductValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<MultiProductValidation> serializer() {
                return ValidationArgs$MultiProductValidation$$serializer.f9341a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MultiProductValidation(int i, BleValidationArgs bleValidationArgs, BleValidationArgs bleValidationArgs2) {
            super(bleValidationArgs);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(ValidationArgs$MultiProductValidation$$serializer.f9341a.getDescriptor(), i, 3);
                throw null;
            }
            this.d = bleValidationArgs2;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.MultiProductValidation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiProductValidation) && Intrinsics.d(this.d, ((MultiProductValidation) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "MultiProductValidation(_validationArgs=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiProductValidation(BleValidationArgs _validationArgs) {
            super(_validationArgs, 0);
            Intrinsics.i(_validationArgs, "_validationArgs");
            this.d = _validationArgs;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$QrScannerValidationArgs;", "Lapp/chalo/scenes/args/ValidationArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class QrScannerValidationArgs extends ValidationArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final BleValidationArgs d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$QrScannerValidationArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/ValidationArgs$QrScannerValidationArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<QrScannerValidationArgs> serializer() {
                return ValidationArgs$QrScannerValidationArgs$$serializer.f9342a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ QrScannerValidationArgs(int i, BleValidationArgs bleValidationArgs, BleValidationArgs bleValidationArgs2) {
            super(bleValidationArgs);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(ValidationArgs$QrScannerValidationArgs$$serializer.f9342a.getDescriptor(), i, 3);
                throw null;
            }
            this.d = bleValidationArgs2;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.QrScanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QrScannerValidationArgs) && Intrinsics.d(this.d, ((QrScannerValidationArgs) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "QrScannerValidationArgs(_validationArgs=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QrScannerValidationArgs(BleValidationArgs _validationArgs) {
            super(_validationArgs, 0);
            Intrinsics.i(_validationArgs, "_validationArgs");
            this.d = _validationArgs;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$QrValidationScreenArgs;", "Lapp/chalo/scenes/args/ValidationArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class QrValidationScreenArgs extends ValidationArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final BleValidationArgs d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/ValidationArgs$QrValidationScreenArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/ValidationArgs$QrValidationScreenArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<QrValidationScreenArgs> serializer() {
                return ValidationArgs$QrValidationScreenArgs$$serializer.f9343a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ QrValidationScreenArgs(int i, BleValidationArgs bleValidationArgs, BleValidationArgs bleValidationArgs2) {
            super(bleValidationArgs);
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(ValidationArgs$QrValidationScreenArgs$$serializer.f9343a.getDescriptor(), i, 3);
                throw null;
            }
            this.d = bleValidationArgs2;
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.QrValidation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QrValidationScreenArgs) && Intrinsics.d(this.d, ((QrValidationScreenArgs) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "QrValidationScreenArgs(_validationArgs=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QrValidationScreenArgs(BleValidationArgs _validationArgs) {
            super(_validationArgs, 0);
            Intrinsics.i(_validationArgs, "_validationArgs");
            this.d = _validationArgs;
        }
    }

    public /* synthetic */ ValidationArgs(BleValidationArgs bleValidationArgs) {
        this.b = bleValidationArgs;
    }

    public ValidationArgs(BleValidationArgs bleValidationArgs, int i) {
        this.b = bleValidationArgs;
    }
}
