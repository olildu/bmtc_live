package app.chalo.data;

import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/PaddingAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PaddingAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2363a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/PaddingAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/PaddingAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PaddingAppModel> serializer() {
            return PaddingAppModel$$serializer.f2364a;
        }
    }

    public PaddingAppModel(int i, int i2, int i3, int i4) {
        this.f2363a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaddingAppModel)) {
            return false;
        }
        PaddingAppModel paddingAppModel = (PaddingAppModel) obj;
        return this.f2363a == paddingAppModel.f2363a && this.b == paddingAppModel.b && this.c == paddingAppModel.c && this.d == paddingAppModel.d;
    }

    public final int hashCode() {
        return (((((this.f2363a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return xs.h(this.c, this.d, ", top=", ")", uf0.s(this.f2363a, this.b, "PaddingAppModel(bottom=", ", end=", ", start="));
    }

    public /* synthetic */ PaddingAppModel(int i, int i2, int i3, int i4, int i5) {
        if ((i & 1) == 0) {
            this.f2363a = 0;
        } else {
            this.f2363a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i4;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i5;
        }
    }
}
