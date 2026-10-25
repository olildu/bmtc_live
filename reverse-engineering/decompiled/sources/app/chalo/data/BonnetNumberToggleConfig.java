package app.chalo.data;

import defpackage.b3;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/BonnetNumberToggleConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BonnetNumberToggleConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final BonnetNumberToggleConfig d = new BonnetNumberToggleConfig();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2315a;
    public final int b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BonnetNumberToggleConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BonnetNumberToggleConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BonnetNumberToggleConfig> serializer() {
            return BonnetNumberToggleConfig$$serializer.f2316a;
        }
    }

    public BonnetNumberToggleConfig() {
        this.f2315a = false;
        this.b = -1;
        this.c = Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonnetNumberToggleConfig)) {
            return false;
        }
        BonnetNumberToggleConfig bonnetNumberToggleConfig = (BonnetNumberToggleConfig) obj;
        return this.f2315a == bonnetNumberToggleConfig.f2315a && this.b == bonnetNumberToggleConfig.b && this.c == bonnetNumberToggleConfig.c;
    }

    public final int hashCode() {
        return ((((this.f2315a ? 1231 : 1237) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonnetNumberToggleConfig(shouldShowBonnetNumber=");
        sb.append(this.f2315a);
        sb.append(", minAppVer=");
        sb.append(this.b);
        sb.append(", maxAppVer=");
        return b3.f(")", this.c, sb);
    }

    public /* synthetic */ BonnetNumberToggleConfig(int i, boolean z, int i2, int i3) {
        this.f2315a = (i & 1) == 0 ? false : z;
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
    }
}
