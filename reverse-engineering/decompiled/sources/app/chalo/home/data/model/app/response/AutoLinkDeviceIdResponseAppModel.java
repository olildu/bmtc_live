package app.chalo.home.data.model.app.response;

import defpackage.cb0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/app/response/AutoLinkDeviceIdResponseAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class AutoLinkDeviceIdResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2949a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/app/response/AutoLinkDeviceIdResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/app/response/AutoLinkDeviceIdResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<AutoLinkDeviceIdResponseAppModel> serializer() {
            return AutoLinkDeviceIdResponseAppModel$$serializer.f2950a;
        }
    }

    public /* synthetic */ AutoLinkDeviceIdResponseAppModel(int i, boolean z) {
        if ((i & 1) == 0) {
            this.f2949a = false;
        } else {
            this.f2949a = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoLinkDeviceIdResponseAppModel) && this.f2949a == ((AutoLinkDeviceIdResponseAppModel) obj).f2949a;
    }

    public final int hashCode() {
        return this.f2949a ? 1231 : 1237;
    }

    public final String toString() {
        return cb0.k("AutoLinkDeviceIdResponseAppModel(isDeviceUpdated=", ")", this.f2949a);
    }

    public AutoLinkDeviceIdResponseAppModel(boolean z) {
        this.f2949a = z;
    }
}
