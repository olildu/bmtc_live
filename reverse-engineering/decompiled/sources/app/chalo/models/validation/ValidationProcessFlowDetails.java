package app.chalo.models.validation;

import defpackage.t10;
import defpackage.vo1;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/models/validation/ValidationProcessFlowDetails;", "", "Companion", "VehicleBasedValidation", "ConductorValidation", "ConductorOrTapInUnifiedFlow", "TapOutValidation", "Lapp/chalo/models/validation/ValidationProcessFlowDetails$ConductorOrTapInUnifiedFlow;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails$ConductorValidation;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails$TapOutValidation;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails$VehicleBasedValidation;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ValidationProcessFlowDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5708a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(5));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProcessFlowDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ValidationProcessFlowDetails> serializer() {
            return (KSerializer) ValidationProcessFlowDetails.f5708a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/models/validation/ValidationProcessFlowDetails$ConductorOrTapInUnifiedFlow;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class ConductorOrTapInUnifiedFlow extends ValidationProcessFlowDetails {
        public static final ConductorOrTapInUnifiedFlow INSTANCE = new ConductorOrTapInUnifiedFlow();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(6));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ConductorOrTapInUnifiedFlow> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/models/validation/ValidationProcessFlowDetails$ConductorValidation;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class ConductorValidation extends ValidationProcessFlowDetails {
        public static final ConductorValidation INSTANCE = new ConductorValidation();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(7));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ConductorValidation> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/models/validation/ValidationProcessFlowDetails$VehicleBasedValidation;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class VehicleBasedValidation extends ValidationProcessFlowDetails {
        public static final VehicleBasedValidation INSTANCE = new VehicleBasedValidation();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(8));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<VehicleBasedValidation> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/ValidationProcessFlowDetails$TapOutValidation;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TapOutValidation extends ValidationProcessFlowDetails {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final long c;
        public final long d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/ValidationProcessFlowDetails$TapOutValidation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/ValidationProcessFlowDetails$TapOutValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TapOutValidation> serializer() {
                return ValidationProcessFlowDetails$TapOutValidation$$serializer.f5709a;
            }
        }

        public TapOutValidation(long j, long j2, String tapId, String conductorValidationStaticPayload) {
            Intrinsics.i(tapId, "tapId");
            Intrinsics.i(conductorValidationStaticPayload, "conductorValidationStaticPayload");
            this.b = tapId;
            this.c = j;
            this.d = j2;
            this.e = conductorValidationStaticPayload;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapOutValidation)) {
                return false;
            }
            TapOutValidation tapOutValidation = (TapOutValidation) obj;
            return Intrinsics.d(this.b, tapOutValidation.b) && this.c == tapOutValidation.c && this.d == tapOutValidation.d && Intrinsics.d(this.e, tapOutValidation.e);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            long j = this.c;
            int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            return this.e.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }

        public final String toString() {
            StringBuilder sbM = t10.m(this.c, "TapOutValidation(tapId=", this.b, ", titoRideExpiryTimeInMillis=");
            xs.r(this.d, ", titoActivationTsInSec=", ", conductorValidationStaticPayload=", sbM);
            return vo1.p(sbM, this.e, ")");
        }

        public /* synthetic */ TapOutValidation(long j, String str, String str2, long j2, int i) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.b(ValidationProcessFlowDetails$TapOutValidation$$serializer.f5709a.getDescriptor(), i, 15);
                throw null;
            }
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = str2;
        }
    }
}
