package app.chalo.config;

import app.chalo.constants.AppConstants;
import defpackage.nf1;
import defpackage.sr;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/config/CountryPhoneNumberConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CountryPhoneNumberConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sr(17)), null, null, null};
    public static final CountryPhoneNumberConfig f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPhoneNumberCountry f1937a;
    public final String b;
    public final String c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/config/CountryPhoneNumberConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/config/CountryPhoneNumberConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CountryPhoneNumberConfig> serializer() {
            return CountryPhoneNumberConfig$$serializer.f1938a;
        }
    }

    static {
        ChaloPhoneNumberCountry.INSTANCE.getClass();
        ChaloPhoneNumberCountry chaloPhoneNumberCountry = ChaloPhoneNumberCountry.Default;
        List list = AppConstants.f1940a;
        Integer num = (Integer) CollectionsKt.H(AppConstants.f1940a);
        f = new CountryPhoneNumberConfig(chaloPhoneNumberCountry, "India", "+91", num != null ? num.intValue() : 10);
    }

    public /* synthetic */ CountryPhoneNumberConfig(int i, ChaloPhoneNumberCountry chaloPhoneNumberCountry, String str, String str2, int i2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CountryPhoneNumberConfig$$serializer.f1938a.getDescriptor(), i, 15);
            throw null;
        }
        this.f1937a = chaloPhoneNumberCountry;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryPhoneNumberConfig)) {
            return false;
        }
        CountryPhoneNumberConfig countryPhoneNumberConfig = (CountryPhoneNumberConfig) obj;
        return this.f1937a == countryPhoneNumberConfig.f1937a && Intrinsics.d(this.b, countryPhoneNumberConfig.b) && Intrinsics.d(this.c, countryPhoneNumberConfig.c) && this.d == countryPhoneNumberConfig.d;
    }

    public final int hashCode() {
        return nf1.e(nf1.e(this.f1937a.hashCode() * 31, 31, this.b), 31, this.c) + this.d;
    }

    public final String toString() {
        return "CountryPhoneNumberConfig(country=" + this.f1937a + ", countryName=" + this.b + ", countryCallingCode=" + this.c + ", phoneNumberLength=" + this.d + ")";
    }

    public CountryPhoneNumberConfig(ChaloPhoneNumberCountry country, String str, String str2, int i) {
        Intrinsics.i(country, "country");
        this.f1937a = country;
        this.b = str;
        this.c = str2;
        this.d = i;
    }
}
