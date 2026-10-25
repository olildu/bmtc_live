package app.chalo.models.validation;

import defpackage.x11;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/validation/RegularBusSoundBasedValidationConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RegularBusSoundBasedValidationConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new x11(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5704a;
    public final int b;
    public final int c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/validation/RegularBusSoundBasedValidationConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/validation/RegularBusSoundBasedValidationConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RegularBusSoundBasedValidationConfig> serializer() {
            return RegularBusSoundBasedValidationConfig$$serializer.f5705a;
        }
    }

    public RegularBusSoundBasedValidationConfig() {
        this.f5704a = false;
        this.b = -1;
        this.c = Integer.MAX_VALUE;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularBusSoundBasedValidationConfig)) {
            return false;
        }
        RegularBusSoundBasedValidationConfig regularBusSoundBasedValidationConfig = (RegularBusSoundBasedValidationConfig) obj;
        return this.f5704a == regularBusSoundBasedValidationConfig.f5704a && this.b == regularBusSoundBasedValidationConfig.b && this.c == regularBusSoundBasedValidationConfig.c && Intrinsics.d(this.d, regularBusSoundBasedValidationConfig.d);
    }

    public final int hashCode() {
        int i = (((((this.f5704a ? 1231 : 1237) * 31) + this.b) * 31) + this.c) * 31;
        List list = this.d;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "RegularBusSoundBasedValidationConfig(isEnabled=" + this.f5704a + ", minAppVer=" + this.b + ", maxAppVer=" + this.c + ", blacklistedAppVer=" + this.d + ")";
    }

    public /* synthetic */ RegularBusSoundBasedValidationConfig(int i, boolean z, int i2, int i3, List list) {
        this.f5704a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = -1;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = Integer.MAX_VALUE;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }
}
