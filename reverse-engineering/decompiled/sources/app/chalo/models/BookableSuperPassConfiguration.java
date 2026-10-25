package app.chalo.models;

import app.chalo.network.config.ChaloJson;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import defpackage.a9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/BookableSuperPassConfiguration;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BookableSuperPassConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a9(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5569a;
    public final SuperPassProductConfigurationProperties b;
    public final SuperPassProductConfigFareMappingResponseAppModel c;
    public final SuperPassProductConfigCategoryResponseAppModel d;
    public final SuperPassProductConfigSubCategoryResponseAppModel e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/BookableSuperPassConfiguration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/BookableSuperPassConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static String a(BookableSuperPassConfiguration lBookablePassConfig) {
            Intrinsics.i(lBookablePassConfig, "lBookablePassConfig");
            Json json = ChaloJson.b;
            json.getClass();
            return json.a(BookableSuperPassConfiguration.INSTANCE.serializer(), lBookablePassConfig);
        }

        public final KSerializer<BookableSuperPassConfiguration> serializer() {
            return BookableSuperPassConfiguration$$serializer.f5570a;
        }
    }

    public /* synthetic */ BookableSuperPassConfiguration(int i, String str, SuperPassProductConfigurationProperties superPassProductConfigurationProperties, SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel, SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel, SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel, List list) {
        if (30 != (i & 30)) {
            PluginExceptionsKt.b(BookableSuperPassConfiguration$$serializer.f5570a.getDescriptor(), i, 30);
            throw null;
        }
        this.f5569a = (i & 1) == 0 ? "" : str;
        this.b = superPassProductConfigurationProperties;
        this.c = superPassProductConfigFareMappingResponseAppModel;
        this.d = superPassProductConfigCategoryResponseAppModel;
        this.e = superPassProductConfigSubCategoryResponseAppModel;
        if ((i & 32) == 0) {
            this.f = new ArrayList();
        } else {
            this.f = list;
        }
    }

    public final String a() {
        String str;
        String str2;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel = this.c;
        if (superPassProductConfigFareMappingResponseAppModel.c != null && (str2 = superPassProductConfigFareMappingResponseAppModel.r) != null && str2.length() != 0) {
            return superPassProductConfigFareMappingResponseAppModel.r;
        }
        SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel = this.d;
        if (!superPassProductConfigCategoryResponseAppModel.e && (str = superPassProductConfigCategoryResponseAppModel.i) != null && str.length() != 0) {
            return superPassProductConfigCategoryResponseAppModel.i;
        }
        String str3 = this.b.p;
        return str3 == null ? "" : str3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SuperPassProductConfigurationProperties getB() {
        return this.b;
    }

    public final boolean c() {
        if (!this.b.o) {
            return false;
        }
        Boolean bool = this.c.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!this.d.e) {
            return false;
        }
        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel = this.e;
        if (superPassProductConfigSubCategoryResponseAppModel != null) {
            return superPassProductConfigSubCategoryResponseAppModel.d;
        }
        return true;
    }

    public final boolean d() {
        Boolean bool = this.c.j;
        return bool != null ? bool.booleanValue() : this.d.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookableSuperPassConfiguration)) {
            return false;
        }
        BookableSuperPassConfiguration bookableSuperPassConfiguration = (BookableSuperPassConfiguration) obj;
        return Intrinsics.d(this.f5569a, bookableSuperPassConfiguration.f5569a) && Intrinsics.d(this.b, bookableSuperPassConfiguration.b) && Intrinsics.d(this.c, bookableSuperPassConfiguration.c) && Intrinsics.d(this.d, bookableSuperPassConfiguration.d) && Intrinsics.d(this.e, bookableSuperPassConfiguration.e) && Intrinsics.d(this.f, bookableSuperPassConfiguration.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f5569a.hashCode() * 31)) * 31)) * 31)) * 31;
        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel = this.e;
        return this.f.hashCode() + ((iHashCode + (superPassProductConfigSubCategoryResponseAppModel == null ? 0 : superPassProductConfigSubCategoryResponseAppModel.hashCode())) * 31);
    }

    public final String toString() {
        return "BookableSuperPassConfiguration(configId=" + this.f5569a + ", superPassProductConfigurationProperties=" + this.b + ", selectedProductFareMapping=" + this.c + ", selectedProductCategory=" + this.d + ", selectedSubCategory=" + this.e + ", requiredProofsList=" + this.f + ")";
    }

    public BookableSuperPassConfiguration(String configId, SuperPassProductConfigurationProperties superPassProductConfigurationProperties, SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel, SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel, SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel, List requiredProofsList) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(requiredProofsList, "requiredProofsList");
        this.f5569a = configId;
        this.b = superPassProductConfigurationProperties;
        this.c = superPassProductConfigFareMappingResponseAppModel;
        this.d = superPassProductConfigCategoryResponseAppModel;
        this.e = superPassProductConfigSubCategoryResponseAppModel;
        this.f = requiredProofsList;
    }
}
