package app.chalo.features.reportproblem;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.JsonElementExtensionsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/reportproblem/ReportProblemResponseConverter;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReportProblemResponseConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsLogger f2765a;

    public ReportProblemResponseConverter(CrashlyticsLogger crashlyticsLogger) {
        this.f2765a = crashlyticsLogger;
    }

    public final LinkedHashMap a(JsonObject jsonObject) {
        ReportProblemCollection reportProblemCollection;
        ReportProblemFeatureCategory reportProblemFeatureCategory;
        ReportProblemFeatureProblem reportProblemFeatureProblem;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JsonObject jsonObjectP = JsonElementExtensionsKt.p(jsonObject, "problemPool");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        CrashlyticsLogger crashlyticsLogger = this.f2765a;
        if (jsonObjectP != null) {
            for (String str : jsonObjectP.f18198a.keySet()) {
                JsonObject jsonObjectP2 = JsonElementExtensionsKt.p(jsonObjectP, str);
                if (jsonObjectP2 == null) {
                    jsonObjectP = jsonObjectP;
                    reportProblemFeatureProblem = null;
                } else {
                    String strS = JsonElementExtensionsKt.s(jsonObjectP2, "problemText", "");
                    String strS2 = JsonElementExtensionsKt.s(jsonObjectP2, "ctaType", "");
                    JsonArray jsonArrayO = JsonElementExtensionsKt.o(jsonObjectP2, "ctaTagList");
                    String strS3 = JsonElementExtensionsKt.s(jsonObjectP2, "chatGroupTag", "");
                    ArrayList arrayList = new ArrayList();
                    if (jsonArrayO != null) {
                        int size = jsonArrayO.f18186a.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                arrayList.add(JsonElementExtensionsKt.i(jsonArrayO, i));
                            } catch (Exception e) {
                                crashlyticsLogger.i(e);
                            }
                        }
                    }
                    reportProblemFeatureProblem = new ReportProblemFeatureProblem(str, strS, strS3, strS2, arrayList);
                }
                if (reportProblemFeatureProblem != null) {
                    linkedHashMap2.put(str, reportProblemFeatureProblem);
                }
                jsonObjectP = jsonObjectP;
            }
        }
        JsonObject jsonObjectP3 = JsonElementExtensionsKt.p(jsonObject, "categoryPool");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (jsonObjectP3 != null) {
            for (String str2 : jsonObjectP3.f18198a.keySet()) {
                JsonObject jsonObjectP4 = JsonElementExtensionsKt.p(jsonObjectP3, str2);
                if (jsonObjectP4 == null) {
                    reportProblemFeatureCategory = null;
                } else {
                    String strS4 = JsonElementExtensionsKt.s(jsonObjectP4, "categoryName", "");
                    JsonArray jsonArrayO2 = JsonElementExtensionsKt.o(jsonObjectP4, "problemList");
                    ArrayList arrayList2 = new ArrayList();
                    if (jsonArrayO2 != null) {
                        int size2 = jsonArrayO2.f18186a.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            try {
                                ReportProblemFeatureProblem reportProblemFeatureProblem2 = (ReportProblemFeatureProblem) linkedHashMap2.get(JsonElementExtensionsKt.i(jsonArrayO2, i2));
                                if (reportProblemFeatureProblem2 != null) {
                                    arrayList2.add(reportProblemFeatureProblem2);
                                }
                            } catch (Exception e2) {
                                crashlyticsLogger.i(e2);
                            }
                        }
                    }
                    reportProblemFeatureCategory = new ReportProblemFeatureCategory(str2, strS4, arrayList2);
                }
                if (reportProblemFeatureCategory != null) {
                    linkedHashMap3.put(str2, reportProblemFeatureCategory);
                }
            }
        }
        JsonObject jsonObjectP5 = JsonElementExtensionsKt.p(jsonObject, "problemCollectionMap");
        if (jsonObjectP5 != null) {
            for (String str3 : jsonObjectP5.f18198a.keySet()) {
                JsonObject jsonObjectP6 = JsonElementExtensionsKt.p(jsonObjectP5, str3);
                if (jsonObjectP6 == null) {
                    reportProblemCollection = null;
                } else {
                    String strS5 = JsonElementExtensionsKt.s(jsonObjectP6, "title", "Help and Support");
                    JsonArray jsonArrayO3 = JsonElementExtensionsKt.o(jsonObjectP6, "categoryList");
                    ArrayList arrayList3 = new ArrayList();
                    if (jsonArrayO3 != null) {
                        int size3 = jsonArrayO3.f18186a.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            try {
                                ReportProblemFeatureCategory reportProblemFeatureCategory2 = (ReportProblemFeatureCategory) linkedHashMap3.get(JsonElementExtensionsKt.i(jsonArrayO3, i3));
                                if (reportProblemFeatureCategory2 != null) {
                                    arrayList3.add(reportProblemFeatureCategory2);
                                }
                            } catch (Exception e3) {
                                crashlyticsLogger.i(e3);
                            }
                        }
                    }
                    reportProblemCollection = new ReportProblemCollection(str3, strS5, arrayList3);
                }
                if (reportProblemCollection != null) {
                    linkedHashMap.put(str3, reportProblemCollection);
                }
            }
        }
        return linkedHashMap;
    }
}
