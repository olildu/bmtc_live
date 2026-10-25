package app.chalo.livetracking.frameworklivetracking.data.model;

import defpackage.ul;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType;", "", "Companion", "AckNotReceived", "ConnectionError", "GenericError", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$AckNotReceived;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$ConnectionError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$GenericError;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ChaloSocketResponseErrorType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4246a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(3));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$AckNotReceived;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class AckNotReceived extends ChaloSocketResponseErrorType {
        public static final AckNotReceived INSTANCE = new AckNotReceived();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(4));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<AckNotReceived> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ChaloSocketResponseErrorType> serializer() {
            return (KSerializer) ChaloSocketResponseErrorType.f4246a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$ConnectionError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ConnectionError extends ChaloSocketResponseErrorType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$ConnectionError$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$ConnectionError;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ConnectionError> serializer() {
                return ChaloSocketResponseErrorType$ConnectionError$$serializer.f4247a;
            }
        }

        public /* synthetic */ ConnectionError(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ChaloSocketResponseErrorType$ConnectionError$$serializer.f4247a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConnectionError) && Intrinsics.d(this.b, ((ConnectionError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("ConnectionError(errorMsg=", this.b, ")");
        }

        public ConnectionError(String str) {
            this.b = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$GenericError;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class GenericError extends ChaloSocketResponseErrorType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$GenericError$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponseErrorType$GenericError;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<GenericError> serializer() {
                return ChaloSocketResponseErrorType$GenericError$$serializer.f4248a;
            }
        }

        public /* synthetic */ GenericError(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ChaloSocketResponseErrorType$GenericError$$serializer.f4248a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericError) && Intrinsics.d(this.b, ((GenericError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("GenericError(errorMsg=", this.b, ")");
        }

        public GenericError(String str) {
            this.b = str;
        }
    }
}
