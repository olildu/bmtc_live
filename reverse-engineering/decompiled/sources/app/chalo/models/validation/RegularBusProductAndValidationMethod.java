package app.chalo.models.validation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/RegularBusProductAndValidationMethod;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RegularBusProductAndValidationMethod {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5696a;
    public final RegularBusSlBleConfig b;
    public final RegularBusSoundBasedValidationConfig c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/RegularBusProductAndValidationMethod$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/RegularBusProductAndValidationMethod;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RegularBusProductAndValidationMethod> serializer() {
            return RegularBusProductAndValidationMethod$$serializer.f5697a;
        }
    }

    public /* synthetic */ RegularBusProductAndValidationMethod(int i, String str, RegularBusSlBleConfig regularBusSlBleConfig, RegularBusSoundBasedValidationConfig regularBusSoundBasedValidationConfig) {
        this.f5696a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = regularBusSlBleConfig;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = regularBusSoundBasedValidationConfig;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusProductAndValidationMethod)) {
            return false;
        }
        RegularBusProductAndValidationMethod regularBusProductAndValidationMethod = (RegularBusProductAndValidationMethod) obj;
        return Intrinsics.d(this.f5696a, regularBusProductAndValidationMethod.f5696a) && Intrinsics.d(this.b, regularBusProductAndValidationMethod.b) && Intrinsics.d(this.c, regularBusProductAndValidationMethod.c);
    }

    public final int hashCode() {
        int iHashCode = this.f5696a.hashCode() * 31;
        RegularBusSlBleConfig regularBusSlBleConfig = this.b;
        int iHashCode2 = (iHashCode + (regularBusSlBleConfig == null ? 0 : regularBusSlBleConfig.hashCode())) * 31;
        RegularBusSoundBasedValidationConfig regularBusSoundBasedValidationConfig = this.c;
        return iHashCode2 + (regularBusSoundBasedValidationConfig != null ? regularBusSoundBasedValidationConfig.hashCode() : 0);
    }

    public final String toString() {
        return "RegularBusProductAndValidationMethod(productType=" + this.f5696a + ", ble=" + this.b + ", sound=" + this.c + ")";
    }

    public RegularBusProductAndValidationMethod(String productType, RegularBusSlBleConfig regularBusSlBleConfig, RegularBusSoundBasedValidationConfig regularBusSoundBasedValidationConfig) {
        Intrinsics.i(productType, "productType");
        this.f5696a = productType;
        this.b = regularBusSlBleConfig;
        this.c = regularBusSoundBasedValidationConfig;
    }
}
