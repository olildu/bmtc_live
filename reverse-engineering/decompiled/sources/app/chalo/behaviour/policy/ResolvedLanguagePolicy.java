package app.chalo.behaviour.policy;

import app.chalo.features.language.data.Language;
import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/behaviour/policy/ResolvedLanguagePolicy;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResolvedLanguagePolicy {
    public static final ResolvedLanguagePolicy b = new ResolvedLanguagePolicy(Language.getEntries());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1071a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ResolvedLanguagePolicy$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ResolvedLanguagePolicy(List supportedLanguages) {
        Intrinsics.i(supportedLanguages, "supportedLanguages");
        this.f1071a = supportedLanguages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResolvedLanguagePolicy) && Intrinsics.d(this.f1071a, ((ResolvedLanguagePolicy) obj).f1071a);
    }

    public final int hashCode() {
        return this.f1071a.hashCode();
    }

    public final String toString() {
        return r1.d("ResolvedLanguagePolicy(supportedLanguages=", ")", this.f1071a);
    }
}
