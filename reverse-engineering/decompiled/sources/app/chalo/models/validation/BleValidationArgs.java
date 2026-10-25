package app.chalo.models.validation;

import app.chalo.constants.Source;
import defpackage.a9;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/BleValidationArgs;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BleValidationArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Source f5692a;
    public final ValidationProduct b;
    public final ValidationProcessFlowDetails c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/BleValidationArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/BleValidationArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BleValidationArgs> serializer() {
            return BleValidationArgs$$serializer.f5693a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new a9(13)), LazyKt.a(lazyThreadSafetyMode, new a9(14)), LazyKt.a(lazyThreadSafetyMode, new a9(15))};
    }

    public /* synthetic */ BleValidationArgs(int i, Source source, ValidationProduct validationProduct, ValidationProcessFlowDetails validationProcessFlowDetails) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(BleValidationArgs$$serializer.f5693a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5692a = source;
        this.b = validationProduct;
        this.c = validationProcessFlowDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleValidationArgs)) {
            return false;
        }
        BleValidationArgs bleValidationArgs = (BleValidationArgs) obj;
        return this.f5692a == bleValidationArgs.f5692a && Intrinsics.d(this.b, bleValidationArgs.b) && Intrinsics.d(this.c, bleValidationArgs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5692a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BleValidationArgs(source=" + this.f5692a + ", validationProduct=" + this.b + ", validationProcessFlowDetails=" + this.c + ")";
    }

    public BleValidationArgs(Source source, ValidationProcessFlowDetails validationProcessFlowDetails, ValidationProduct validationProduct) {
        Intrinsics.i(source, "source");
        Intrinsics.i(validationProduct, "validationProduct");
        Intrinsics.i(validationProcessFlowDetails, "validationProcessFlowDetails");
        this.f5692a = source;
        this.b = validationProduct;
        this.c = validationProcessFlowDetails;
    }
}
