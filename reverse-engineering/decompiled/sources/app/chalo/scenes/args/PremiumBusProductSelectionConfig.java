package app.chalo.scenes.args;

import defpackage.b3;
import defpackage.nf1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusProductSelectionConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PremiumBusProductSelectionConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9295a;
    public final boolean b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/PremiumBusProductSelectionConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/PremiumBusProductSelectionConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusProductSelectionConfig> serializer() {
            return PremiumBusProductSelectionConfig$$serializer.f9296a;
        }
    }

    public /* synthetic */ PremiumBusProductSelectionConfig(int i, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.f9295a = false;
        } else {
            this.f9295a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductSelectionConfig)) {
            return false;
        }
        PremiumBusProductSelectionConfig premiumBusProductSelectionConfig = (PremiumBusProductSelectionConfig) obj;
        return this.f9295a == premiumBusProductSelectionConfig.f9295a && this.b == premiumBusProductSelectionConfig.b && this.c == premiumBusProductSelectionConfig.c;
    }

    public final int hashCode() {
        return ((((this.f9295a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return b3.g(")", nf1.r("PremiumBusProductSelectionConfig(isComingFromPassLandingScreen=", ", isPPRSelectionDisabled=", ", isComingFromChaloBusTab=", this.f9295a, this.b), this.c);
    }

    public PremiumBusProductSelectionConfig(boolean z, int i) {
        boolean z2 = (i & 1) == 0;
        z = (i & 2) != 0 ? false : z;
        boolean z3 = (i & 4) == 0;
        this.f9295a = z2;
        this.b = z;
        this.c = z3;
    }
}
