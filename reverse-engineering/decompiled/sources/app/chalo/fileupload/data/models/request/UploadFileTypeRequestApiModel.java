package app.chalo.fileupload.data.models.request;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/fileupload/data/models/request/UploadFileTypeRequestApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UploadFileTypeRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2770a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/fileupload/data/models/request/UploadFileTypeRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/fileupload/data/models/request/UploadFileTypeRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UploadFileTypeRequestApiModel> serializer() {
            return UploadFileTypeRequestApiModel$$serializer.f2771a;
        }
    }

    public /* synthetic */ UploadFileTypeRequestApiModel(int i, String str) {
        if (1 == (i & 1)) {
            this.f2770a = str;
        } else {
            PluginExceptionsKt.b(UploadFileTypeRequestApiModel$$serializer.f2771a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UploadFileTypeRequestApiModel) && Intrinsics.d(this.f2770a, ((UploadFileTypeRequestApiModel) obj).f2770a);
    }

    public final int hashCode() {
        return this.f2770a.hashCode();
    }

    public final String toString() {
        return vo1.B("UploadFileTypeRequestApiModel(fileType=", this.f2770a, ")");
    }

    public UploadFileTypeRequestApiModel(String fileType) {
        Intrinsics.i(fileType, "fileType");
        this.f2770a = fileType;
    }
}
