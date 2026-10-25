package app.chalo.superpass.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/app/ProofDocumentProps;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProofDocumentProps {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9539a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/app/ProofDocumentProps$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/app/ProofDocumentProps;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static ProofDocumentProps a(String lStringObject) {
            Intrinsics.i(lStringObject, "lStringObject");
            List listU = StringsKt.U(lStringObject, new String[]{"~~~"}, 6);
            return new ProofDocumentProps((String) listU.get(0), (String) listU.get(1), (String) listU.get(2), (String) listU.get(3), (String) listU.get(4), (String) listU.get(5), (String) listU.get(6));
        }

        public final KSerializer<ProofDocumentProps> serializer() {
            return ProofDocumentProps$$serializer.f9540a;
        }
    }

    public /* synthetic */ ProofDocumentProps(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(ProofDocumentProps$$serializer.f9540a.getDescriptor(), i, 127);
            throw null;
        }
        this.f9539a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProofDocumentProps)) {
            return false;
        }
        ProofDocumentProps proofDocumentProps = (ProofDocumentProps) obj;
        return Intrinsics.d(this.f9539a, proofDocumentProps.f9539a) && Intrinsics.d(this.b, proofDocumentProps.b) && Intrinsics.d(this.c, proofDocumentProps.c) && Intrinsics.d(this.d, proofDocumentProps.d) && Intrinsics.d(this.e, proofDocumentProps.e) && Intrinsics.d(this.f, proofDocumentProps.f) && Intrinsics.d(this.g, proofDocumentProps.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f9539a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProofDocumentProps(proofId=", this.f9539a, ", proofName=", this.b, ", shortDescription=");
        cb0.t(sbE, this.c, ", longDescription=", this.d, ", placeHolderImageUrl=");
        cb0.t(sbE, this.e, ", formUrl=", this.f, ", tutorialUrl=");
        return vo1.p(sbE, this.g, ")");
    }

    public ProofDocumentProps(String proofId, String proofName, String shortDescription, String longDescription, String placeHolderImageUrl, String formUrl, String tutorialUrl) {
        Intrinsics.i(proofId, "proofId");
        Intrinsics.i(proofName, "proofName");
        Intrinsics.i(shortDescription, "shortDescription");
        Intrinsics.i(longDescription, "longDescription");
        Intrinsics.i(placeHolderImageUrl, "placeHolderImageUrl");
        Intrinsics.i(formUrl, "formUrl");
        Intrinsics.i(tutorialUrl, "tutorialUrl");
        this.f9539a = proofId;
        this.b = proofName;
        this.c = shortDescription;
        this.d = longDescription;
        this.e = placeHolderImageUrl;
        this.f = formUrl;
        this.g = tutorialUrl;
    }
}
